<b>CRC Description </b>
<center>
   <table border="1" style="border-collapse: collapse;text-align: center;">
      <tr style="width:300px;">
         <th colspan="2">CLASS: Queue Manager</th>
      </tr>
      <tr style="width:300px;">
         <td style="width:150px;font-weight: bold;">RESPONSIBILITIES:</td>
         <td style="width:150px;font-weight: bold;">COLLABORATIONS:</td>
      </tr>
      <tr style="width:300px;">
         <td style="width:150px;">Note down customer sign up request and send waitlist message to customer.</td>
         <td rowspan="2"> Customer</td>
      </tr>
      <tr style="width:300px;">
         <td style="width:150px;">Recieves availability information from Table Manager</td>
      </tr>
      <tr style="width:300px;">
         <td style="width:150px;">Send confirmation message to customer once he reaches top of the queue. If the customer says no then queue manager looks for the next customer who satify the seat criteria</td>
         <td> Table Manager </td>
      </tr>
   </table>
   <br/>
   <table cellpadding="10" border = "0">
      <tr>
         <td>
            <table border="1" style="border-collapse: collapse;text-align: center;">
               <tr style="width:300px;">
                  <th colspan="2">CLASS: Customer</th>
               </tr>
               <tr style="width:300px;">
                  <td style="width:150px;font-weight: bold;">RESPONSIBILITIES:</td>
                  <td style="width:150px;font-weight: bold;">COLLABORATIONS:</td>
               </tr>
               <tr style="width:300px;">
                  <td style="width:150px;">Sign Up for table with name, mobile number and number of required seats</td>
                  <td rowspan="2"> Queue Manager</td>
               </tr>
               <tr style="width:300px;">
                  <td style="width:150px;">Confirm or Leave on seat availability message </td>
               </tr>
            </table>
         </td>
         <td>
            <table border="1" style="border-collapse: collapse;text-align: center;">
               <tr style="width:300px;">
                  <th colspan="2">CLASS: Table Manager</th>
               </tr>
               <tr style="width:300px;">
                  <td style="width:150px;font-weight: bold;">RESPONSIBILITIES:</td>
                  <td style="width:150px;font-weight: bold;">COLLABORATIONS:</td>
               </tr>
               <tr style="width:300px;">
                  <td style="width:150px;">Keep track of all the tables with the number of seats</td>
                  <td rowspan="2"> Queue Mananger</td>
               </tr>
               <tr style="width:300px;">
                  <td style="width:150px;">Send information to queue manager when seats at table gets vaccant.</td>
               </tr>
            </table>
         </td>
      </tr>
   </table>
</center>
<br/>
<b> Problem approach </b>
<ul>
   <li>I have used chain of responsibility design pattern for the problem.</li> 
   <li>The customer signup with the Queue manager with name, mobile and number of seats request.</li> 
   <li>The table manager send the information when a table with specified number of seat is available.</li> 
   <li>The queue manager acts as the handler who pass on the information to the top most customer satisfying the number of seats criteria.</li> 
   <li>If the customer confirms then the table is allocated otherwise the information is passed to the next customer in queue.</li>    <li>Thus, the customers are in chain in this problem.</li>
</ul>
