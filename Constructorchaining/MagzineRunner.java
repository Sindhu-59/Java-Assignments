class MagzineRunner{

	public static void main(String args[]){
	 
	
	Article article = new Article("Swacch Bharath","kavitha","public place",1600);
	
	Page page = new Page();
	page.pageNumber=30;
    page.isColored=true;
    page.contentType="Nature";
    page.article=article;
	
	Magzine magzine = new Magzine();
	magzine.title="Sahakara";
    magzine.publisher="Chandrashekar";
    magzine.totalPages=30;
    magzine.price=70;
    magzine.page=page;	
	magzine.getMagzineInfo();
	
	}
	}