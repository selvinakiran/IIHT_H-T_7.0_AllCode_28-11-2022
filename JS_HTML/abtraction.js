function car (color,model,cost,fueltype){     
        this.color=color;
        this.model =model;
        this.cost=cost;
        this.fueltype=fueltype;
        let runningCostPeryear=30000

        this.getDetails = function(){
            console.log("color::"+this.color);
            console.log("model::"+this.model);
            console.log("cost::"+this.cost);
            console.log("fueltype::"+this.fueltype);
            console.log("runningCostPeryear::" +this.runningCostPeryear);
        }

        this.totalcostofOwership= function()
        {
        console.log(runningCostPeryear + cost);
        }
}

let balenoo=new car("black","A1","5000000","Petrol");
balenoo.getDetails();
console.log(balenoo.totalcostofOwership());
