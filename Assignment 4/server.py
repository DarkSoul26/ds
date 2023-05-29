import socket
import pickle
import time

def main():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind(('localhost', 1234))
    server_socket.listen(1)

    print("Server started and listening on port 1234...")

     # Get the server's current time
    server_time = int(time.time() * 1000)
    print("Server initial time:", server_time)

    # Accept client connection
    client_socket, client_address = server_socket.accept()
    print(f"Client connected: {client_address}")

    # Receive time request from client
    client_time = pickle.loads(client_socket.recv(1024))
    print("Received time request from client:", client_time)

    # Calculate the time difference
    time_difference = (client_time - server_time)/2
    print("Time that is to be added to server", time_difference)
    # Send the time difference back to the client

    client_socket.sendall(pickle.dumps(server_time+time_difference))
   

    print("New server time that is being sent to client", server_time+time_difference)

    # Clean up resources
    client_socket.close()
    server_socket.close()

if __name__ == '__main__':
    main()

