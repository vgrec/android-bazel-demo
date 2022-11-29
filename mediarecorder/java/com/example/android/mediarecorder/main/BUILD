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
    visibility = ["//visibility:public"],
    deps = [
        ":main_application",
        "//mediarecorder/java/com/example/android/common/media",
    ],
)
