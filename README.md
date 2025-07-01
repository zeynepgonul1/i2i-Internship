# i2i-INTERNSHIP HOMEWORKS

# CLOUD-EX-01
Cloud Exercise 01 - VM Creation and Ping Test on GCP
This repository contains the solution for the **CLOUD-EX-01** assignment from i2i Academy.

# Assignment Objective
The purpose of this exercise was to:
- Create a Virtual Machine (VM) on a cloud service provider (GCP or AWS)
- Retrieve the external IP address of the VM
- Perform a `ping` test from a local machine to the cloud VM
- Prove network accessibility
  
# Cloud Provider Used
- **Google Cloud Platform (GCP)**
- VM type: `e2-micro`
- OS: Debian Linux
- Region: europe-west1
  
# Steps Performed
1. Created a free-tier account on GCP
2. Enabled Compute Engine API
3. Deployed a VM instance with minimal configuration
4. Retrieved the external IP address
5. Ran `ping` command from local machine to that IP
   
# Ping Test Result
Pinging 34.52.153.202 with 32 bytes of data:

Reply from 34.52.153.202: bytes=32 time=48ms TTL=53

Reply from 34.52.153.202: bytes=32 time=47ms TTL=53

Reply from 34.52.153.202: bytes=32 time=47ms TTL=53

Reply from 34.52.153.202: bytes=32 time=46ms TTL=53


Ping statistics for 34.52.153.202:

  Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),

Approximate round trip times in milli-seconds:

  Minimum = 46ms, Maximum = 48ms, Average = 47ms

# Files Included
- `CLOUD-EX-01.docx`: Word document containing the full assignment and solution.
- `README.md`: This explanation file.
  
#  What I Learned
- How to use a cloud platform to create and manage VM instances
- How to retrieve and use external IPs
- How to verify server reachability using the `ping` command
- Gained basic hands-on experience with cloud computing infrastructure

_Created as part of the i2i Systems Internship Program / 2025_
