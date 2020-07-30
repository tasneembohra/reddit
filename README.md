# reddit

App to fetch Github user and their repo.

![Debug CI](https://github.com/tasneembohra/reddit/workflows/Debug%20CI/badge.svg?branch=master)


## Getting Started

This project follows MVVM architecture and Single Activity architecture.

Testing Framworks - Espress, Mockito - TODO

<img src="https://github.com/tasneembohra/githubrepo/blob/master/screenshot/home.png" alt="alt text" width="250" height="500"/>
<img src="https://github.com/tasneembohra/githubrepo/blob/master/screenshot/list-land.png" alt="alt text" width="250" height="500"/>
<img src="https://github.com/tasneembohra/githubrepo/blob/master/screenshot/detail1.png" alt="alt text" width="250" height="500"/>
<img src="https://github.com/tasneembohra/githubrepo/blob/master/screenshot/detail2.png" alt="alt text" width="250" height="500"/>
<img src="https://github.com/tasneembohra/githubrepo/blob/master/screenshot/detail3.png" alt="alt text" width="250" height="500"/>
<img src="https://github.com/tasneembohra/githubrepo/blob/master/screenshot/detail4.png" alt="alt text" width="250" height="500"/>

### Prerequisites

Install the latest version of all of the following items:
- [Android Studio](https://developer.android.com/studio/)
- [JRE 8 / JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)


## Workflow

We follow the [Gitflow Workflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)

### Pull Request Naming

Use this template: `[Issue Number]: [Issue description]`

ex. 1244: User Repo Color

### Pull Request Updating to `develop`

Rather than pulling and merging changes from develop, and then pushing that merge as a commit to your PR, rebase your PR's branch onto develop.

## Resources

### Language and Architecture

- [Kotlin For Android](https://kotlinlang.org/docs/reference/android-overview.html)
- [Android Development Guidlines](https://developer.android.com/)
- [Material Design Guidlines](https://material.io/design)
- [Android Architecture Component](https://developer.android.com/topic/libraries/architecture)
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
  - [Life Cycle Aware Component](https://developer.android.com/topic/libraries/architecture/lifecycle)
  - [Databinding](https://developer.android.com/topic/libraries/data-binding)
- [Navigation Component](https://developer.android.com/guide/navigation)
- [Glide](https://github.com/bumptech/glide)

# Assignment

As Android developers, we inherently love Kotlin- and part of keeping up with Jetbrains is being in touch with news as it breaks! We would like to task you with building a simple Android application that will ingest 'Kotlin News' JSON feed from Reddit, displaying the results in a list / recycler view with the ability to tap into the full article.
The 'main' view should implement a listView or recyclerView that displays a list of the articles. If the article contains a thumbnail image, we should display that image in the list item with the article title on top of the image. If the article doesn't contain an image, just display the article title. The list items should resize to accommodate for the image, preserving aspect ratio. If the list item is just text, make sure to shrink the list item to the size of the title. This 'main' view should be presented inside of a fragment or Activity, with the title "Kotlin News".
Once we can scroll a list of articles, we will want a way to display the full article in a new view. In the case the article contains a thumbnail image, we'd like to show that image at the top of the article and article body. If no thumbnail, just article body. There should also be a way to return to the 'main' view. The navigation bar title should contain the article title.
It's up to you how you'd like to architect the data source and models, but know you will be asked to explain your decisions. We don't need you to over engineer a simple app, but design your classes to be maintainable and readable. When you come in for an in-person interview we will ask you to build a new feature or two on top of this codebase so having a solid foundation will definitely help later. You are free to use any 3rd party dependencies (Maven, Gradle etc. ) but also be prepared to explain why!
Acceptance Criteria:
-This application should pull JSON data from the following: https://www.reddit.com/r/kotlin/.json
-The data should be serialized into some kind of type safe object or objects
-The 'main' view must pass the article 'object' in some way to the 'article view'
-The app should be tested to run on a real Android device- meaning your layout works on different size devices as intended
-The codebase should be written entirely using Kotlin, build with minimum SDK 23
-You must upload your completed code to a public Github repository and send us the link!
What we are looking for:
-You are comfortable developing in Kotlin and are familiar with the Android platform -You have experience using ConstraintLayout as well as interfacing with RecyclerView -You use design patterns tastefully and can explain tradeoffs ie. pros and cons
-You have an understanding of higher order functions and Kotlin specific paradigms -You know how to design a data source and make REST calls efficiently
-You understand how to handle network errors or missing data (optional) -You have experience using source control
 
-You have experience designing architecture that is easily scaled and maintained
