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

