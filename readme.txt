
  
Routing Table Simulation
TCSS 430 Summer 2016
Group 5 Adam Marr, David Humphreys, Gabriel Houle

	Our simulation comprised several components. We implemented  packet route selection, CIDR aggregation, and simulated neighbor routers in order to update the table.

	The packet route selection works by first generating a random IP address that is the destination of our packet. This address has a 50% chance of being selected from a pre-generated table and a 50% chance to be completely random. This IP address is then checked against the entries contained inside the table and the best route is selected. The best route selection process we implemented included bit masking the address to get the network address of the packet. Since we have implemented CIDR aggregation our algorithm also selects the longest prefix match. If no route is found (generally the case for the completely random IPs), we will send the packet to the default address.

	The simulated neighbor routers will occasionally send updated entries. In this case we check to see which of our eleven routes from our table (ten from our table plus a new eleventh route from our neighbor) are best matched to be aggregated. The best match is found by finding which two matching routes have the closest prefix to one another. We also perform CIDR aggregation in this step, and check if any routes can be merged together to cater to more addresses. If none of our entries can be aggregated the new entry from the neighboring router is discarded.
  