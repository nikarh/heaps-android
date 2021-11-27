.PHONY: build

build:
	cd openal-soft && git reset --hard && patch < ../openal-soft.patch
	cd heaps-android-app && ./gradlew build
