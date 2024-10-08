# Gratify App - Memory Capture Extension

## Objective
The *Gratify* app now extends beyond task management, offering users a way to **capture and manage memories** using a structured and visually dynamic interface. This updated feature enables users to store both **textual notes** and **photographs** of their memories, enhancing the app’s usability as a personal journal. The project expansion continues to leverage the **MVVM architecture**, **Room for local data persistence**, and **Kotlin Coroutines** to ensure smooth and maintainable functionality.

### Skills Learned

- Deepened proficiency in **MVVM architecture**, ensuring scalable and clean code.
- Expanded use of **Kotlin Coroutines** for efficient asynchronous tasks.
- Enhanced **LiveData** and **ViewBinding** techniques to manage dynamic UI updates.
- Implemented **Room database** for local data storage, extending its use for handling **memory entries** that include both **text** and **photo data**.
- Developed customized **RecyclerViews** for displaying memory lists and snapshots.
- Refined UI design for memory capture, incorporating **image and text inputs** in a seamless user experience.

### Tools Used

- **Kotlin** for streamlined, modern mobile development.
- **Android Jetpack** (ViewModel, LiveData, Room) for implementing the MVVM architecture and managing data-binding.
- **Kotlin Coroutines** for handling memory-saving processes asynchronously.
- **RecyclerView** to create dynamic lists for memories, including both images and text.
- **Room Database** to store and retrieve text and image data locally.
- **Camera & Image Picker API** to allow users to capture or upload photos for each memory.
- **Glide** for loading and displaying images efficiently in the app’s UI.

## Features

1. **Memory Capture:** Users can create new memory entries that consist of **text** descriptions and **photos**, capturing significant moments easily.
2. **Dynamic UI Updates:** The app’s **MVVM structure** ensures that changes to memory entries (text or photos) are instantly reflected in the UI, making it intuitive and user-friendly.
3. **Search Functionality:** A **search memory** feature allows users to quickly retrieve specific memories based on text or tags, ensuring ease of access.
4. **Home Screen:** The app’s **home screen** showcases a **list of captured memories**, both recent and past, with thumbnails of photos and brief text previews.
5. **Detail View:** Users can tap on a memory to view its **detailed text** and **full-sized photo**, providing a comprehensive experience.
6. **Empty Memory List UI:** If no memories are stored, an **empty state UI** is presented, guiding users to start capturing memories by adding text or photos.
7. **Room Database for Local Storage:** All memory entries, including **photos and text**, are stored locally using Room, ensuring persistence even when the app is closed.
8. **Compose Memory Feature:** Users can easily compose new memories with integrated image capture or upload functionality, and seamlessly add text descriptions.

### Screenshots

Here are some screenshots showcasing the key sections of the memory capture functionality:

#### Home Screen
<img src="https://github.com/Avwaveaf/screenshots/blob/main/gratify_home.jpeg" alt="Home Screen" width="150">

#### Detail Memory Screen
<img src="https://github.com/Avwaveaf/screenshots/blob/main/gratify_detail.jpeg" alt="Detail Memory" width="150">

#### Search Memory Screen
<img src="https://github.com/Avwaveaf/screenshots/blob/main/gratify_search.jpeg" alt="Search Memory" width="150">

#### Compose Memory Screen
<img src="https://github.com/Avwaveaf/screenshots/blob/main/gratify_compose.jpeg" alt="Compose Memory" width="150">

#### Empty Memory List
<img src="https://github.com/Avwaveaf/screenshots/blob/main/gratify_empty_list.jpeg" alt="Empty Memory List" width="150">

### Future Improvements

- **Cloud Sync:** Introduce cloud-based synchronization so users can back up their memories online.
- **Tagging & Categorization:** Allow users to add tags or categories to their memories for better organization.
- **Multiple Photos per Memory:** Extend the memory capture to support adding multiple images for each memory entry.



## Steps
1. Install the required Android dependencies such as Kotlin, Android Jetpack libraries (ViewModel, LiveData, Room).
2. Set up the project following the MVVM architecture pattern.
3. Implement the task management features with proper UI-binding using LiveData.
4. Integrate local data storage using Room, ensuring data persistence.
5. Build the Bottom Sheet Dialog for task creation and editing to provide a smooth user experience.
