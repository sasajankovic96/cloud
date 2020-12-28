Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.provision "file", source: "./cloud-demo", destination: "$HOME/cloud"
  config.vm.provision :shell, path: "docker-compose.sh"
  config.vm.network "forwarded_port", guest: 5050, host: 5050
end
