object third{

def bookprice(x:Int):Double={
return x*24.95;
}

def discount(amount:Double):Double={
return amount*0.4;
}

def shippingcost(x:Int):Double={
return 3*x+(x-50)*0.75;
}

def main(args: Array[String]){

val x = 60;
val y = (bookprice(x)-discount(bookprice(x))+shippingcost(x));
println(y);

}

}