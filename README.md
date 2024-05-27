# xrdata

# Error 1
Error in xtfrm.data.frame(x) : cannot xtfrm data frames
9.
stop("cannot xtfrm data frames")
8.
xtfrm.data.frame(x)
7.
xtfrm(x)
6.
as.vector(xtfrm(x))
5.
FUN(X[[i]], ...)
4.
lapply(z, function(x) if (is.object(x)) as.vector(xtfrm(x)) else x)
3.
order(-rfImp1)
2.
`[.data.frame`(rfImp1, order(-rfImp1), , drop = FALSE)
1.
rfImp1[order(-rfImp1), , drop = FALSE]
```{r}
# solution 
kindly specify the column for example my end this line of code ha d the above error
use_conditional_true = T # whether to use the conditional argument in the cforest function call 

library(caret) 
library(mlbench)
library(gbm)

set.seed(200)
simulated = mlbench.friedman1(200,sd=1)
simulated = cbind(simulated$x, simulated$y)
simulated = as.data.frame(simulated)
colnames(simulated)[ncol(simulated)] = "y" 

library(randomForest)

model1 = randomForest( y ~ ., data=simulated, importance=TRUE, ntree=1000 )
rfImp1 = varImp(model1, scale=FALSE)
rfImp1 = rfImp1[ order(-rfImp1), , drop=FALSE ]
print("randomForest (no correlated predictor)")
print(rfImp1)
```
this error was from line  `rfImp1 = rfImp1[ order(-rfImp1), , drop=FALSE ]`

to solve this I specifed the columns like this `rfImp1 <- rfImp1[order(-rfImp1$column_name), , drop = FALSE]`

# github not displaying commits

the solution to this is simple juuust check the user.email in your git configurations on your pc. ensure it macthes with the one online when you try to push from githumb online webite.

thank you

for linux users in R when you get ths error message install the libcurl packaghes
-------------------------- [ERROR MESSAGE] ---------------------------
<stdin>:1:10: fatal error: curl/curl.h: No such file or directory
compilation terminated.
--------------------------------------------------------------------
ERROR: configuration failed for package ‘curl’
* removing ‘/home/dragon/R/x86_64-pc-linux-gnu-library/4.3/curl’
Warning in install.packages :
  installation of package ‘curl’ had non-zero exit status
ERROR: dependency ‘curl’ is not available for package ‘httr’
* removing ‘/home/dragon/R/x86_64-pc-linux-gnu-library/4.3/httr’
Warning in install.packages :
  installation of package ‘httr’ had non-zero exit status

The downloaded source packages are in
	‘/tmp/RtmpjfQ2Pm/downloaded_packages’

sudo apt-get update
sudo apt-get install libcurl4-openssl-dev

thanks you if this worked for you

# if you get this error solve it like this  
Defaulting to user installation because normal site-packages is not writeable
Collecting pytorch
  Using cached pytorch-1.0.2.tar.gz (689 bytes)
  Preparing metadata (setup.py) ... Building wheels for collected packages: pytorch
  Building wheel for pytorch (setup.py) ... error: subprocess-exited-with-error
  
  × python setup.py bdist_wheel did not run successfully.
  │ exit code: 1
  ╰─> [6 lines of output]
      Traceback (most recent call last):
        File "<string>", line 2, in <module>
        File "<pip-setuptools-caller>", line 34, in <module>
        File "/tmp/pip-install-v9l0hf52/pytorch_1558fa418bad42be841b8584a41a5ff2/setup.py", line 15, in <module>
          raise Exception(message)
      Exception: You tried to install "pytorch". The package named for PyTorch is "torch"
      [end of output]
  
  note: This error originates from a subprocess, and is likely not a problem with pip.
  ERROR: Failed building wheel for pytorch
  Running setup.py clean for pytorch
Failed to build pytorch
ERROR: Could not build wheels for pytorch, which is required to install pyproject.toml-based projects
Note: you may need to restart the kernel to use updated packages.


## run  
*pip install torch and pip install torch torchvision and  pip install --user torch torchvision *

run them one by one thank you.
