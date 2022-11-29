load("@build_bazel_rules_android//android:rules.bzl", "android_binary", "android_library")

android_library(
    name = "internal",
    srcs = [
        "InternalApplication.java",
    ],
    visibility = ["//visibility:public"],
    deps = [
        "//mediarecorder/java/com/example/android/mediarecorder/main:main_lib",
    ],
)
