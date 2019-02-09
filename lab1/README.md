<b>LAB 1</b>

<b>Gumball Machine 1</b>
<ul>
<li>No of coin slots = 1</li>
<li>Cost = 25</li>
<li>Accepted Coins - Quarter</li>
<li>Does not have coin reject bar</li>
<li>The machine has crank</li>
</ul>

<br>

<b>Gumball Machine 2</b>
<ul>
<li>No of coin slots = 2</li>
<li>Cost = 50</li>
<li>Accepted Coins - Quarter</li>
<li>Does not have coin reject bar</li>
<li>The machine has crank</li>
</ul>

<br>

<b>Gumball Machine 3</b>
<ul>
<li>No of coin slots = 1</li>
<li>Cost = 50</li>
<li>Accepted Coins - Quarter, Nickel, Dimes</li>
<li>Has coin reject bar</li>
<li>The machine has no crank. So the gumball comes out after entering the required amount.</li>
</ul>

<br>
<br>
<b>Solution approach</b>
<ul>
<li>I have used inheritance to solve both the problem.</li> 
<li>The common properties in the three machines is num_of_gumballs instance variable and releaseGumball method. So I have encapsulated these in the base class.</li> 
<li> Rest of the functionalities varies for each machine, so I have implemented those in the subclasses class.</li>
</ul>
