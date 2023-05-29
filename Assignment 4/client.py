import socket
import pickle
import time

def main():
    # Connect to the server
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.connect(('localhost', 1234))
    print("Connected to server.")

    # Get the client's current time
    client_time = int(time.time() * 1000)
    print("Client time:", client_time)

    # Send time request to the server
    server_socket.sendall(pickle.dumps(client_time))
    print("Sent time request to server.")

    # Receive time difference from server
    new_server_time = pickle.loads(server_socket.recv(1024))
    print("Received time from server:", new_server_time)

    print("Time to be added to client", new_server_time-client_time)
    # Adjust client's time based on the difference
    adjusted_time = client_time+(new_server_time-client_time)
    print("Adjusted client time:", adjusted_time)

    # Clean up resources
    server_socket.close()

if __name__ == '__main__':
    main()



