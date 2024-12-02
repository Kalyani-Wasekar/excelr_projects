package selenium;

public class xpath_axes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent axis
        //email parent  //input[@id="email"]//parent::div

        //ancestor
        //input[@id="email"]//ancestor::div

        //child
        //div[@id="globalContainer"]//child::div

        //following
        //input[@id="email"]//following::div
        //input[@id="email"]//following-sibling::div

        //Preceding
        //  xpath & preceding::div
        //*[@id="content"]/div/div/div/div[2]/div/div[1]//preceding::div

	}

}
