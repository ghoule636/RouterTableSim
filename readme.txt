
  
Routing Table Simulation
TCSS 430 Summer 2016
Group 5 Adam Marr, David Humphreys, Gabriel Houle

	Our simulation comprised several components. We implemented  packet route selection, CIDR aggregation, and simulated neighbor routers in order to update the table.

	The packet route selection works by first generating a random IP address that is the destination of our packet. There is a 50% chance that this address is completely random, or another 50% chance that it is selected from a pre-generated table. This random IP address is then checked against the entries contained inside the table and the best route is selected. The best route selection process we implemented included bit masking the address to get the network address of the packet. Since we have implemented CIDR aggregation our algorithm also selects the longest prefix match. If no route is found (generally the case for the completely random IPs), we will send the packet to the default address.

	The simulated neighbor routers will occasionally send updated entries. We would check to see if a route has changed at all and will select the route with less hops. We also perform CIDR aggregation in this step, and check if any routes can be merged together to cater to more addresses.
  