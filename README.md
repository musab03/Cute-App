<h1> Cute App</h1>

This exercise demonstrates the arrangement of images on a screen and basic button interactions. The app displays several images arranged in a specific layout, each of which is clickable/touchable. When the user interacts with an image, a `TextView` informs the user which image they interacted with, using a distinct color for the text. Additionally, a "Clear Text" button, which is initially invisible, becomes visible upon interaction with any image, allowing the user to reset the app to its original state.

## Features

- **Image Arrangement**: Multiple images are arranged in a specific layout on the screen.
- **Interactive Images**: Each image is clickable/touchable, triggering a response.
- **Feedback Text**: A `TextView` updates with a message indicating which image was clicked, changing its color.
- **Clear Text Button**: A "Clear Text" button appears when any image is interacted with, allowing the user to reset the app to its initial state.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/image-interaction-app.git
    ```
2. Open the project in Android Studio.
3. Build and run the app on an emulator or a physical device.

## Usage

1. Launch the app.
2. Interact with any of the images displayed on the screen.
3. Observe the message in the `TextView` indicating which image was clicked, with the text in a distinct color.
4. Notice the "Clear Text" button becoming visible upon image interaction.
5. Click the "Clear Text" button to reset the app to its original state.

## Code Example

Here is an example of the code that handles the image button click and updates the `TextView` and button visibility:

```kotlin
findViewById<ImageButton>(R.id.imageButton1).setOnClickListener {
    textView.text = "You clicked on image 1!"
    textView.setTextColor(Color.RED)
    clearTextButton.visibility = View.VISIBLE
}

// Repeat similar blocks for other image buttons with respective IDs and messages

clearTextButton.setOnClickListener {
    textView.text = ""
    clearTextButton.visibility = View.GONE
}
