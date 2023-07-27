def ip_address(addr):
    new_addr = ""
    split_addr = addr.split(".")
    separator = "[.]"
    new_addr = separator.join(split_addr)
    return new_addr

ip = ip_address("10.2.142.1")
print(ip)    