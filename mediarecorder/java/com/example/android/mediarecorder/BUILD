load("@build_bazel_rules_android//android:rules.bzl", "android_binary", "android_library")

android_library(
    name = "main_application",
    srcs = [
        "MainApplication.java",
    ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [
        "//mediarecorder/java/com/example/android/common/media",
    ],
)

android_library(
    name = "main_lib",
    srcs = [
        "MainActivity.java",
    ],
    deps = [
        "//mediarecorder/java/com/example/android/common/media",
        ":main_application"
    ],
)

android_binary(
    name = "mediarecorder",
    manifest = "AndroidManifest.xml",
    deps = [":main_lib"],
)
