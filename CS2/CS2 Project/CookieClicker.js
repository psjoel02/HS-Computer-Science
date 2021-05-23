
var cookies = 0;
var total = 0;
var multiplier = 1.0;
var count = 0;

var lu = 0;
var ld = 0;
var lt = 0;
var lq = 0;
var lc = 0;

var alpha = 0;
var beta = 0;
var gamma = 0;
var theta = 0;
var mu = 0;
var lambda = 0;
var sigma = 0;
var omega = 0;
var makehim = 0;




function change2()
{
   
   var random = Math.floor(Math.random() * 10) + 1;

  if(random == 1)
  document.body.style.backgroundImage = "url('background1.jpg')";

  if(random == 2)
  document.body.style.backgroundImage = "url('background2.jpg')";

  if(random == 3)
  document.body.style.backgroundImage = "url('background3.jpg')";

  if(random == 4)
  document.body.style.backgroundImage = "url('background4.jpg')";

  if(random == 5) 
  document.body.style.backgroundImage = "url('background5.jpg')";

  if(random == 6)
  document.body.style.backgroundImage = "url('background6.jpg')";

  if(random == 7)
  document.body.style.backgroundImage = "url('background7.jpg')";

  if(random == 8)
  document.body.style.backgroundImage = "url('background8.jpg')";

  if(random == 9)
  document.body.style.backgroundImage = "url('background9.jpg')";

  if(random == 10)
  document.body.style.backgroundImage = "url('pug.jpg')";
}


function name2() 
{
    var txt = prompt("Enter Your Bakery's Name", "Cookie Monster")
    document.getElementById("name2").innerHTML = txt;
  }

  function name3() 
{
      var txt = prompt("Enter Your Bakery's Type", "Bakery")
      document.getElementById("name3").innerHTML = txt;
  }

function reset()
   {
       cookies = 0;
       total = 0;
       document.getElementById("amount").innerHTML = cookies;
       document.getElementById ("totalc").innerHTML = total;
       window.location.reload();
   }

   function click2()
   {
       cookies = cookies + (1 * multiplier);
       total = total + (1 * multiplier);

       var click1 = document.getElementById("hide1");
       var click2 = document.getElementById("hide2");
       var click3 = document.getElementById("hide3");
       var click4 = document.getElementById("hide4");
       var click5 = document.getElementById("hide5");
       var click6 = document.getElementById("hide6");
       var click7 = document.getElementById("hide7");
       var click8 = document.getElementById("hide8");
       var click9 = document.getElementById("hide9");

       var click10 = document.getElementById("hide10");
       var click11 = document.getElementById("hide11");
       var click12 = document.getElementById("hide12");
       var click13 = document.getElementById("hide13");
       var click14 = document.getElementById("hide14");

       document.getElementById("amount").innerHTML = Math.round(cookies);
       document.getElementById ("totalc").innerHTML = Math.round(total);

       if(total >= 25)
       {

       click1.style.cursor="pointer";
       }

       if(total >= 1000)
       {

       click2.style.cursor="pointer";
       }

       if(total >= 10000)
       {

       click3.style.cursor="pointer";
       }

       if(total >= 100000)
       {

       click4.style.cursor="pointer";
       }

       if(total >= 100000000)
       {

       click5.style.cursor="pointer";
       }

       if(total >= 10000000000)
       {

       click6.style.cursor="pointer";
       }

       if(total >= 1000000000000)
       {

       click7.style.cursor="pointer";
       }

       if(total >= 100000000000000)
       {

       click8.style.cursor="pointer";
       }

       if(total >= 1000000000000000000000000)
       {

       click9.style.cursor="pointer";
       }

       if(total >= 50)
       {

        click10.style.cursor="pointer";
       }
       if(total >= 100)
       {

        click11.style.cursor="pointer";
       }
       if(total >= 1000)
       {

        click12.style.cursor="pointer";
       }
       if(total >= 10000)
       {

        click13.style.cursor="pointer";
       }
       if(total >= 100000)
       {

        click14.style.cursor="pointer";
       }


   }

   function uno()
   {
       if(cookies < 50)
    {
        alert("Error: Insufficient Cookies");
    }

    if(cookies >= 50)
       {

       cookies = cookies - 50;
    multiplier = (multiplier * 1.05);
    lu++;
    document.getElementById("lu").innerHTML = lu;
    document.getElementById("amount").innerHTML = Math.round(cookies);
   }

}
   function dos()
   {
     if(cookies < 100)
    {
        alert("Error: Insufficient Cookies");
    }

    if(cookies >= 100)
    {

    cookies = cookies - 100;
    multiplier = (multiplier * 1.1);
    ld++;
    document.getElementById("ld").innerHTML = ld;
    document.getElementById("amount").innerHTML = Math.round(cookies);
   }

}
   function tres()
   {
    if(cookies < 50)
    {
        alert("Error: Insufficient Cookies");
    }
    if(cookies >= 1000)
    {

    cookies = cookies - 1000;
    multiplier = (multiplier * 1.15);
    lt++;
    document.getElementById("lt").innerHTML = lt;
    document.getElementById("amount").innerHTML = Math.round(cookies);
   }
}
   function quatro()
   {
    if(cookies < 10000)
    {
        alert("Error: Insufficient Cookies");
    }
    if(cookies >= 10000)
    {

    cookies = cookies - 10000;
    multiplier = (multiplier * 1.2);
    lq++;
    document.getElementById("lq").innerHTML = lq;
    document.getElementById("amount").innerHTML = Math.round(cookies);
   }
}
   function cinco()
   {
    if(cookies < 10000000)
    {
        alert("Error: Insufficient Cookies");
    }
    if(cookies >= 10000000)
    {
        
    cookies = cookies - 10000000
    multiplier = (multiplier * 1.5);
    lc++;
    document.getElementById("lc").innerHTML = lc;
    document.getElementById("amount").innerHTML = Math.round(cookies);
   }
}


   function autoclick() 
   {

       if(cookies < 50)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 50)
       {
        cookies = cookies - 50;
        alpha++;
        document.getElementById("alpha").innerHTML = alpha;
        setInterval(function()
        {
            cookies = cookies + 1;
            total = total + 1;
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 7000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }

   function autoclick2() 
   {
       if(cookies < 10000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 10000)
       {
        cookies = cookies - 10000;
        beta++;
        document.getElementById("beta").innerHTML = beta;
        setInterval(function()
        {
            cookies = cookies + 10;
            total = total + 10;
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 7000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }

   function autoclick3() 
   {
       if(cookies < 1000000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 1000000)
       {
        cookies = cookies - 1000000;
        gamma++;
        document.getElementById("gamma").innerHTML = gamma;
        setInterval(function()
        {
            cookies = cookies + 1000;
            total = total + 100;
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 5000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }

   function autoclick4() 
   {
       if(cookies < 10000000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 10000000)
       {
        cookies = cookies - 10000000;
        theta++;
        document.getElementById("theta").innerHTML = theta;
        setInterval(function()
        {
            cookies = cookies + 10000;
            total = total + 10000
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 5000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }

   function autoclick5() 
   {
       if(cookies < 1000000000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 1000000000)
       {
        cookies = cookies - 1000000000;
        mu++;
        document.getElementById("mu").innerHTML = mu;
        setInterval(function()
        {
            cookies = cookies + 10000000;
            total = total + 10000000;
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 5000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }

   function autoclick6() 
   {
       if(cookies < 100000000000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 100000000000)
       {
        cookies = cookies - 100000000000;
        lambda++;
        document.getElementById("lambda").innerHTML = lambda;
        setInterval(function()
        {
            cookies = cookies + 100000000;
            total = total + 100000000;
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 5000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }

   function autoclick7() 
   {
       if(cookies < 10000000000000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 10000000000000)
       {
        cookies = cookies - 10000000000000;
        sigma++;
        document.getElementById("sigma").innerHTML = sigma;
        setInterval(function()
        {
            cookies = cookies + 10000000000;
            total = total + 10000000000; 
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 5000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }

   function autoclick8() 
   {
       if(cookies < 1000000000000000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 1000000000000000)
       {
        cookies = cookies - 1000000000000000;
        omega++;
        document.getElementById("omega").innerHTML = omega;
        setInterval(function()
        {
            cookies = cookies + 1000000000000;
            total = total + 1000000000000;
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 5000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

   }


   function autoclick9() 
   {
       if(cookies < 10000000000000000000000000000000000000000000000)
       {
           alert("Error: Insufficient Cookies");
       }

       if(cookies >= 10000000000000000000000000000000000000000000000)
       {
        
        document.getElementById("drag") =  draggable="true";
        cookies = cookies - 10000000000000000000000000000000000000000000000;
        makehim++;
        document.getElementById("makehim").innerHTML = makehim;
        setInterval(function()
        {
            cookies = cookies + 10000000000000000000000000000000000000000000000;
            total = total + 10000000000000000000000000000000000000000000000;
           amount.innerHTML = Math.round(cookies);
           totalc.innerHTML = Math.round(total);
        }, 5000);
        amount.innerHTML = Math.round(cookies);
        totalc.innerHTML = Math.round(total);
       }

       if(total >= 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000)
       {
           alert("You have beaten Cookie Clicker, Congratulations!!!!!");
       }

   }