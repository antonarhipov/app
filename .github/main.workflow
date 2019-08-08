workflow "Build" {
  on = "push"
  resolves = ["Test"]
}

action "Test" {
  uses = "MrRamych/gradle-actions/openjdk-12@2.1"
  args = "build"
}
