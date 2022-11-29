load("@build_bazel_rules_android//android:rules.bzl", "android_binary", "android_library")

android_library(
    name = "debug_application",
    srcs = [
        "DebugApplication.java",
    ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [
        "//mediarecorder/java/com/example/android/common/media",
    ],
)
