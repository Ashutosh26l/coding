def ip_to_binary(ip_address):
    # Split the IP address into its four octets
    octets = ip_address.split('.')
    
    # Function to convert an integer to an 8-bit binary string
    def int_to_binary_string(number):
        binary_string = ""
        for i in range(8):
            binary_string = str(number % 2) + binary_string
            number //= 2
        return binary_string.zfill(8)

    # Convert each octet to its binary form and ensure it's 8 bits long
    binary_octets = [int_to_binary_string(int(octet)) for octet in octets]
    
    # Join the binary octets into a single string
    binary_ip = ''.join(binary_octets)
    
    return binary_ip

# Input: IP address as a string
ip_address = input("Enter a 32-bit IP address: ")

# Convert the IP address to binary
binary_ip = ip_to_binary(ip_address)

# Print the binary representation
print(f"Binary representation of {ip_address} is {binary_ip}")
