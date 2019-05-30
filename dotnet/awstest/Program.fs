open System
open Amazon.S3

[<EntryPoint>]
let main argv =
    printfn "Runing..."
    let s3 = new AmazonS3Client(Amazon.RegionEndpoint.EUWest1)
    s3.ListBucketsAsync().Result.Buckets
    |> Seq.iter (fun x -> printfn "%s" x.BucketName)
    0
