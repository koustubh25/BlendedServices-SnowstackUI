package org.businessServices;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class Facebook {
	String APP_ID="1418924851687760";
	String APP_SECRET="5d1cf5e60075cc529d364299e8ba6d2d";
	String ACCESS_TOKEN;
	Facebook(String access_token)
	{
	
		ACCESS_TOKEN=access_token;
		
		
	}
	
	public Facebook_user_bio get_user_bio()
	{
	
		FacebookClient facebookClient = new DefaultFacebookClient(ACCESS_TOKEN, APP_SECRET);

		User user = facebookClient.fetchObject("me", User.class);
		Facebook_user_bio user_bio=new Facebook_user_bio();
		user_bio.username=user.getUsername();
		user_bio.emailID=user.getEmail();
		user_bio.display_pic="dfddfdf";
		return user_bio;

	
	}

}
