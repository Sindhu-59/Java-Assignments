class SuperMarket{

static String aruns = "Aruns";
static String dailyDay = "DailyDay";
static String nandini = "Nandini";
static String amul = "Amul";
static String kwalityWall = "Kwality wall";
static String motherDairy = "Mother Dairy";
static String vadilal = "Vadilal";
static String creamBell = "CreamBell";
static String hawer = "Hawer";
static String naturals = "Naturals";

static String iceCreams[] = {aruns, dailyDay, nandini, amul, kwalityWall, motherDairy, vadilal, creamBell, hawer, naturals};


static String fogg = "Fogg";
static String nudeLuxury = "Nude Luxury";
static String ajmal = "Ajmal";
static String kelvin = "Kelvin";
static String guess = "Guess";
static String davidOff = "DavidOff";
static String gucci = "Gucci";
static String denver = "Denver";
static String versecase = "versecase";
static String engage = "engage";

static String perfumes[] = {fogg, nudeLuxury, ajmal, kelvin, guess, davidOff, gucci, denver, versecase, engage};

// Groceries
static String atta = "Atta";
static String rice = "Rice";
static String ragi = "Ragi";
static String barley = "Barley";
static String kelocs = "Kelocs";
static String cereals = "Cereals";
static String cookies = "Cookies";
static String dryFruits = "DryFruits";
static String nuts = "Nuts";
static String seeds = "Seeds";

static String groceries[] = {atta, rice, ragi, barley, kelocs, cereals, cookies, dryFruits, nuts, seeds};


static String primer = "Primer";
static String toner = "Toner";
static String foundation = "Foundation";
static String eyeliner = "Eyeliner";
static String lipsticks = "lipstics";
static String cream = "Cream";
static String nailPolish = "Nail Polish";
static String lipGlosses = "lip glosses";
static String blush = "Blush";

static String cosmatics[] = {primer, toner, foundation, eyeliner, lipsticks, cream, nailPolish, lipGlosses, blush};
"Blender"};
 
 public static void main(String args[]){
	System.out.println("The number of ice cream brands "+iceCreams.length);
	/*System.out.println(iceCreams[0]+""+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+iceCreams[9]);
	System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+iceCreams[5]+" "+perfumes[6]+" "+perfumes[7]+" "+perfumes[8]+" "+perfumes[9]);
	System.out.println(groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);
	System.out.println(cosmatics[0]+" "+cosmatics[1]+" "+cosmatics[2]+" "+cosmatics[3]+" "+cosmatics[4]+" "+cosmatics[5]+" "+cosmatics[6]+" "+cosmatics[7]+" "+cosmatics[8]+" "+cosmatics[9]);*/
	for(String iceCream:iceCreams){
		System.out.println(iceCream);
	}
	System.out.println("The number perfume brands "+perfumes.length);
	for(String perfume:perfumes){
		System.out.println(perfume);
	}
	System.out.println("The number of groceries "+groceries.length);
	for(String grocery:groceries){
		System.out.println(grocery);
	System.out.println("The number of cosmatics "+cosmatics.length);
	 for(String cosmatic:cosmatics){
		 System.out.println(cosmatic);
	 }
	}
 
 }
}