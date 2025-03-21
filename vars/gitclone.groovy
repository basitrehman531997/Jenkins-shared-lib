def call(string url, string branch)
{
sh "whoami"
git url: "$url", branch: "$branch"
echo "Successful clone"
}
