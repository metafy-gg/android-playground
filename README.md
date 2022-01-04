# android-playground
You have been assigned the ticket *AND-42* which has the following description:

* Perform a call to the `/sessions` endpoint to fetch the sessions history
* Create a Calendar screen and render the list of sessions grouped by the date they are scheduled at
* Navigate to the Calendar screen when the user clicks on the FAB located on the Home screen

## Screenshot for reference
<img src="https://user-images.githubusercontent.com/83378776/148134037-699103c6-cbf0-4a76-80a5-799c74ed7de9.jpeg" width="369" height="800">

## Things not to worry about

* Colors. Feel free to use whites and grays instead of the different dark color of the screenshot. Our designers are great and we are not taking their jobs 😉
* Fonts. Default Roboto is fine.
* Matching the exact layout of the session card. Showing the time range, student picture, and session name is enough 👍
* Focus simply on the list and not the "All sessions", nor "September 2021" nor the top right corner button

## Things we will evaluate
* Git
* SOLID principles
* Kotlin knowledge
* Android framework knowledge (recent technologies)
* Is something testable? Let us know (we created the [CalendarViewModelTest](app/src/test/java/gg/metafy/playground/view/calendar/) if you want to have some fun there ✅)
* All that boring stuff we love 💚

## Instructions
* Clone the repo and briefly go through the files to make an idea of how things are structured
* On [MainActivity](app/src/main/java/gg/metafy/playground/MainActivity.kt) we are trying to set up the toolbar, but synthetics imports are deprecated, what should we do?
* Implement the requirements of the *AND-42* ticket on the [calendar package](app/src/main/java/gg/metafy/playground/view/calendar/)
* This project is open to any technical decisions you may take, so feel free to move stuff around
* If you want to see a preview of what the server will return take a look at the [response file](utility/response.json).


# Bonus challenge
If you completed everything up until this point, congratulations, your take-home project is complete. However, if you want to take your project to the next level, we have a bonus challenge for you.

Take a look a the following video (check out how the date dividers behave) and implement/propose a way to achieve this behaviour. When you are done with these tasks, send the branch you worked on to engineering@metafy.gg

https://user-images.githubusercontent.com/83378776/148136223-3b9f1db6-a714-4f26-a264-643df2bb8118.mp4

