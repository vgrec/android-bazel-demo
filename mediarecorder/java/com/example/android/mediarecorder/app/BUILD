load("@build_bazel_rules_android//android:rules.bzl", "android_binary", "android_library")

android_binary(
    name = "app",
    dex_shards = 50,
    manifest = "debug/AndroidManifest.xml",
    multidex = "native",
    resource_files = glob(["debug/res/**"]),
    deps = [
        "//mediarecorder/java/com/example/android/mediarecorder/main:main_lib",
    ],
)
