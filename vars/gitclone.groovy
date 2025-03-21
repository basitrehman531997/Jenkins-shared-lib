def call(String url, String branch)
{
sh "whoami"
git url: "$url", branch: "$branch"
echo "Successful clone"
}
