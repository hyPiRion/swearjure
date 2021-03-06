{-# OPTIONS_GHC -Wall -Werror #-}

module Swearjure.Errors where

data SwjError = SyntaxError String
              | IllegalState String
              | IllegalArgument String
              | ArityException Int String
              | CastException String String
              | NotFound String
              deriving (Show)

errString :: SwjError -> String
errString (SyntaxError err) = err
errString (IllegalState err) = "Illegal state: " ++ err
errString (IllegalArgument err) = "Illegal argument: " ++ err
errString (ArityException n fname) = "Wrong number of args (" ++ show n
                                     ++ ") passed to: " ++ fname
errString (CastException from to) = "Cast exception: " ++ from
                                    ++ " cannot be cast to " ++ to
errString (NotFound sym) = "Unable to resolve symbol: " ++ sym
                           ++ " in this context"

