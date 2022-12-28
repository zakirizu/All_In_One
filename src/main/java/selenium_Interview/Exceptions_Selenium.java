package selenium_Interview;
		/*
NoSuchElementException
NoSuchWindowException
NoSuchFrameException
NoAlertPresentException
InvalidSelectorException
ElementNotVisibleException
ElementNotSelectableException
TimeoutException
NoSuchSessionException
StaleElementReferenceException

		 
*********StaleElementReferenceException***********
		
		Say �id� of a username field is �username_1� and the XPath will be //*[@id=�firstname_1?]. 
		When you open the page again the �id� might change say to ��firstname _11�. 
		In this case, the test will fail because the WebDriver could not find the element. 
		In this case, StaleElementReferenceException will be thrown.
				
		StaleElementReferenceException is thrown when an object for a particular web element was created in the program without any problem and however; 
		this element is no longer present in the window. This can happen if there was a

		Navigation to another page
		DOM has refreshed
		A frame or window switch
		WebElement firstName = driver.findElement(By.id(�firstname�));
		
		driver.switchTo().window(Child_Window);
		
		element.sendKeys(�Aaron�);
		
		In the code above, object firstName was created and then the window was switched. 
		Then, WebDriver tries to type �Aaron� in the form field. In this case StaleElementReferenceException is thrown.
		
	}

}
		*/