(ns cl-playground.http
  (:require [clj-http.client :as client]
            ))

(->
 (client/get
  "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22YHOO%22%2C%22AAPL%22%2C%22GOOG%22%2C%22MSFT%22)%0A%09%09&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=")
 :body
 )

;"{\"query\":{\"count\":4,\"created\":\"2014-11-21T00:32:29Z\",\"lang\":\"en-US\",\"diagnostics\":{\"url\":[{\"execution-start-time\":\"0\",\"execution-stop-time\":\"3\",\"execution-time\":\"3\",\"content\":\"http://datatables.org/alltables.env\"},{\"execution-start-time\":\"3\",\"execution-stop-time\":\"8\",\"execution-time\":\"5\",\"content\":\"http://www.datatables.org/yahoo/finance/yahoo.finance.quotes.xml\"},{\"execution-start-time\":\"18\",\"execution-stop-time\":\"51\",\"execution-time\":\"33\",\"content\":\"http://download.finance.yahoo.com/d/quotes.csv?f=aa2bb2b3b4cc1c3c4c6c8dd1d2ee1e7e8e9ghjkg1g3g4g5g6ii5j1j3j4j5j6k1k2k4k5ll1l2l3mm2m3m4m5m6m7m8nn4opp1p2p5p6qrr1r2r5r6r7ss1s7t1t7t8vv1v7ww1w4xy&s=YHOO,AAPL,GOOG,MSFT\"}],\"publiclyCallable\":\"true\",\"cache\":{\"execution-start-time\":\"15\",\"execution-stop-time\":\"17\",\"execution-time\":\"2\",\"method\":\"GET\",\"type\":\"MEMCACHED\",\"content\":\"5d1e1de680846a307c9874dc3d6878dc\"},\"query\":{\"execution-start-time\":\"17\",\"execution-stop-time\":\"51\",\"execution-time\":\"34\",\"params\":\"{url=[http://download.finance.yahoo.com/d/quotes.csv?f=aa2bb2b3b4cc1c3c4c6c8dd1d2ee1e7e8e9ghjkg1g3g4g5g6ii5j1j3j4j5j6k1k2k4k5ll1l2l3mm2m3m4m5m6m7m8nn4opp1p2p5p6qrr1r2r5r6r7ss1s7t1t7t8vv1v7ww1w4xy&s=YHOO,AAPL,GOOG,MSFT]}\",\"content\":\"select * from csv where url=@url and columns='Ask,AverageDailyVolume,Bid,AskRealtime,BidRealtime,BookValue,Change&PercentChange,Change,Commission,Currency,ChangeRealtime,AfterHoursChangeRealtime,DividendShare,LastTradeDate,TradeDate,EarningsShare,ErrorIndicationreturnedforsymbolchangedinvalid,EPSEstimateCurrentYear,EPSEstimateNextYear,EPSEstimateNextQuarter,DaysLow,DaysHigh,YearLow,YearHigh,HoldingsGainPercent,AnnualizedGain,HoldingsGain,HoldingsGainPercentRealtime,HoldingsGainRealtime,MoreInfo,OrderBookRealtime,MarketCapitalization,MarketCapRealtime,EBITDA,ChangeFromYearLow,PercentChangeFromYearLow,LastTradeRealtimeWithTime,ChangePercentRealtime,ChangeFromYearHigh,PercebtChangeFromYearHigh,LastTradeWithTime,LastTradePriceOnly,HighLimit,LowLimit,DaysRange,DaysRangeRealtime,FiftydayMovingAverage,TwoHundreddayMovingAverage,ChangeFromTwoHundreddayMovingAverage,PercentChangeFromTwoHundreddayMovingAverage,ChangeFromFiftydayMovingAverage,PercentChangeFromFiftydayMovingAverage,Name,Notes,Open,PreviousClose,PricePaid,ChangeinPercent,PriceSales,PriceBook,ExDividendDate,PERatio,DividendPayDate,PERatioRealtime,PEGRatio,PriceEPSEstimateCurrentYear,PriceEPSEstimateNextYear,Symbol,SharesOwned,ShortRatio,LastTradeTime,TickerTrend,OneyrTargetPrice,Volume,HoldingsValue,HoldingsValueRealtime,YearRange,DaysValueChange,DaysValueChangeRealtime,StockExchange,DividendYield'\"},\"javascript\":{\"execution-start-time\":\"14\",\"execution-stop-time\":\"81\",\"execution-time\":\"67\",\"instructions-used\":\"277091\",\"table-name\":\"yahoo.finance.quotes\"},\"user-time\":\"82\",\"service-time\":\"43\",\"build-version\":\"0.2.212\"},\"results\":{\"quote\":[{\"symbol\":\"YHOO\",\"Ask\":\"51.30\",\"AverageDailyVolume\":\"37588500\",\"Bid\":\"51.20\",\"AskRealtime\":\"51.30\",\"BidRealtime\":\"51.20\",\"BookValue\":\"37.493\",\"Change_PercentChange\":\"+0.67 - +1.32%\",\"Change\":\"+0.67\",\"Commission\":null,\"Currency\":\"USD\",\"ChangeRealtime\":\"+0.67\",\"AfterHoursChangeRealtime\":\"N/A - N/A\",\"DividendShare\":\"0.00\",\"LastTradeDate\":\"11/20/2014\",\"TradeDate\":null,\"EarningsShare\":\"7.482\",\"ErrorIndicationreturnedforsymbolchangedinvalid\":null,\"EPSEstimateCurrentYear\":\"1.59\",\"EPSEstimateNextYear\":\"1.11\",\"EPSEstimateNextQuarter\":\"0.25\",\"DaysLow\":\"50.27\",\"DaysHigh\":\"52.23\",\"YearLow\":\"32.15\",\"YearHigh\":\"52.62\",\"HoldingsGainPercent\":\"- - -\",\"AnnualizedGain\":null,\"HoldingsGain\":null,\"HoldingsGainPercentRealtime\":\"N/A - N/A\",\"HoldingsGainRealtime\":null,\"MoreInfo\":\"cn\",\"OrderBookRealtime\":null,\"MarketCapitalization\":\"48.552B\",\"MarketCapRealtime\":null,\"EBITDA\":\"720.7M\",\"ChangeFromYearLow\":\"+19.10\",\"PercentChangeFromYearLow\":\"+59.41%\",\"LastTradeRealtimeWithTime\":\"N/A - <b>51.25</b>\",\"ChangePercentRealtime\":\"N/A - +1.32%\",\"ChangeFromYearHigh\":\"-1.37\",\"PercebtChangeFromYearHigh\":\"-2.60%\",\"LastTradeWithTime\":\"Nov 20 - <b>51.25</b>\",\"LastTradePriceOnly\":\"51.25\",\"HighLimit\":null,\"LowLimit\":null,\"DaysRange\":\"50.27 - 52.23\",\"DaysRangeRealtime\":\"N/A - N/A\",\"FiftydayMovingAverage\":\"44.3175\",\"TwoHundreddayMovingAverage\":\"38.4778\",\"ChangeFromTwoHundreddayMovingAverage\":\"+12.7722\",\"PercentChangeFromTwoHundreddayMovingAverage\":\"+33.19%\",\"ChangeFromFiftydayMovingAverage\":\"+6.9325\",\"PercentChangeFromFiftydayMovingAverage\":\"+15.64%\",\"Name\":\"Yahoo! Inc.\",\"Notes\":null,\"Open\":\"50.60\",\"PreviousClose\":\"50.58\",\"PricePaid\":null,\"ChangeinPercent\":\"+1.32%\",\"PriceSales\":\"10.35\",\"PriceBook\":\"1.35\",\"ExDividendDate\":null,\"PERatio\":\"6.76\",\"DividendPayDate\":null,\"PERatioRealtime\":null,\"PEGRatio\":\"5.18\",\"PriceEPSEstimateCurrentYear\":\"31.81\",\"PriceEPSEstimateNextYear\":\"45.57\",\"Symbol\":\"YHOO\",\"SharesOwned\":null,\"ShortRatio\":\"1.70\",\"LastTradeTime\":\"4:00pm\",\"TickerTrend\":\"&nbsp;+-+===&nbsp;\",\"OneyrTargetPrice\":\"51.06\",\"Volume\":\"28908180\",\"HoldingsValue\":null,\"HoldingsValueRealtime\":null,\"YearRange\":\"32.15 - 52.62\",\"DaysValueChange\":\"- - +1.32%\",\"DaysValueChangeRealtime\":\"N/A - N/A\",\"StockExchange\":\"NasdaqNM\",\"DividendYield\":null,\"PercentChange\":\"+1.32%\"},{\"symbol\":\"AAPL\",\"Ask\":\"116.38\",\"AverageDailyVolume\":\"58387300\",\"Bid\":\"116.34\",\"AskRealtime\":\"116.38\",\"BidRealtime\":\"116.34\",\"BookValue\":\"19.015\",\"Change_PercentChange\":\"+1.64 - +1.43%\",\"Change\":\"+1.64\",\"Commission\":null,\"Currency\":\"USD\",\"ChangeRealtime\":\"+1.64\",\"AfterHoursChangeRealtime\":\"N/A - N/A\",\"DividendShare\":\"1.8457\",\"LastTradeDate\":\"11/20/2014\",\"TradeDate\":null,\"EarningsShare\":\"6.45\",\"ErrorIndicationreturnedforsymbolchangedinvalid\":null,\"EPSEstimateCurrentYear\":\"7.71\",\"EPSEstimateNextYear\":\"8.49\",\"EPSEstimateNextQuarter\":\"1.98\",\"DaysLow\":\"114.85\",\"DaysHigh\":\"116.86\",\"YearLow\":\"70.5071\",\"YearHigh\":\"117.28\",\"HoldingsGainPercent\":\"- - -\",\"AnnualizedGain\":null,\"HoldingsGain\":null,\"HoldingsGainPercentRealtime\":\"N/A - N/A\",\"HoldingsGainRealtime\":null,\"MoreInfo\":\"cnsprmiIed\",\"OrderBookRealtime\":null,\"MarketCapitalization\":\"682.1B\",\"MarketCapRealtime\":null,\"EBITDA\":\"60.449B\",\"ChangeFromYearLow\":\"+45.8029\",\"PercentChangeFromYearLow\":\"+64.96%\",\"LastTradeRealtimeWithTime\":\"N/A - <b>116.31</b>\",\"ChangePercentRealtime\":\"N/A - +1.43%\",\"ChangeFromYearHigh\":\"-0.97\",\"PercebtChangeFromYearHigh\":\"-0.83%\",\"LastTradeWithTime\":\"Nov 20 - <b>116.31</b>\",\"LastTradePriceOnly\":\"116.31\",\"HighLimit\":null,\"LowLimit\":null,\"DaysRange\":\"114.85 - 116.86\",\"DaysRangeRealtime\":\"N/A - N/A\",\"FiftydayMovingAverage\":\"105.127\",\"TwoHundreddayMovingAverage\":\"97.4076\",\"ChangeFromTwoHundreddayMovingAverage\":\"+18.9024\",\"PercentChangeFromTwoHundreddayMovingAverage\":\"+19.41%\",\"ChangeFromFiftydayMovingAverage\":\"+11.183\",\"PercentChangeFromFiftydayMovingAverage\":\"+10.64%\",\"Name\":\"Apple Inc.\",\"Notes\":null,\"Open\":\"114.95\",\"PreviousClose\":\"114.67\",\"PricePaid\":null,\"ChangeinPercent\":\"+1.43%\",\"PriceSales\":\"3.68\",\"PriceBook\":\"6.03\",\"ExDividendDate\":\"Nov  6\",\"PERatio\":\"17.78\",\"DividendPayDate\":\"Nov 13\",\"PERatioRealtime\":null,\"PEGRatio\":\"1.31\",\"PriceEPSEstimateCurrentYear\":\"14.87\",\"PriceEPSEstimateNextYear\":\"13.51\",\"Symbol\":\"AAPL\",\"SharesOwned\":null,\"ShortRatio\":\"1.70\",\"LastTradeTime\":\"4:00pm\",\"TickerTrend\":\"&nbsp;-+====&nbsp;\",\"OneyrTargetPrice\":\"118.02\",\"Volume\":\"43367280\",\"HoldingsValue\":null,\"HoldingsValueRealtime\":null,\"YearRange\":\"70.5071 - 117.28\",\"DaysValueChange\":\"- - +1.43%\",\"DaysValueChangeRealtime\":\"N/A - N/A\",\"StockExchange\":\"NasdaqNM\",\"DividendYield\":\"1.61\",\"PercentChange\":\"+1.43%\"},{\"symbol\":\"GOOG\",\"Ask\":\"535.00\",\"AverageDailyVolume\":\"1750060\",\"Bid\":\"534.55\",\"AskRealtime\":\"535.00\",\"BidRealtime\":\"534.55\",\"BookValue\":\"145.685\",\"Change_PercentChange\":\"-2.16 - -0.40%\",\"Change\":\"-2.16\",\"Commission\":null,\"Currency\":\"USD\",\"ChangeRealtime\":\"-2.16\",\"AfterHoursChangeRealtime\":\"N/A - N/A\",\"DividendShare\":\"0.00\",\"LastTradeDate\":\"11/20/2014\",\"TradeDate\":null,\"EarningsShare\":\"19.002\",\"ErrorIndicationreturnedforsymbolchangedinvalid\":null,\"EPSEstimateCurrentYear\":\"25.65\",\"EPSEstimateNextYear\":\"29.40\",\"EPSEstimateNextQuarter\":\"6.99\",\"DaysLow\":\"531.08\",\"DaysHigh\":\"535.11\",\"YearLow\":\"502.80\",\"YearHigh\":\"604.83\",\"HoldingsGainPercent\":\"- - -\",\"AnnualizedGain\":null,\"HoldingsGain\":null,\"HoldingsGainPercentRealtime\":\"N/A - N/A\",\"HoldingsGainRealtime\":null,\"MoreInfo\":\"cnprmiIed\",\"OrderBookRealtime\":null,\"MarketCapitalization\":\"362.8B\",\"MarketCapRealtime\":null,\"EBITDA\":\"19.960B\",\"ChangeFromYearLow\":\"+32.03\",\"PercentChangeFromYearLow\":\"+6.37%\",\"LastTradeRealtimeWithTime\":\"N/A - <b>534.83</b>\",\"ChangePercentRealtime\":\"N/A - -0.40%\",\"ChangeFromYearHigh\":\"-70.00\",\"PercebtChangeFromYearHigh\":\"-11.57%\",\"LastTradeWithTime\":\"Nov 20 - <b>534.83</b>\",\"LastTradePriceOnly\":\"534.83\",\"HighLimit\":null,\"LowLimit\":null,\"DaysRange\":\"531.08 - 535.11\",\"DaysRangeRealtime\":\"N/A - N/A\",\"FiftydayMovingAverage\":\"546.205\",\"TwoHundreddayMovingAverage\":\"561.856\",\"ChangeFromTwoHundreddayMovingAverage\":\"-27.026\",\"PercentChangeFromTwoHundreddayMovingAverage\":\"-4.81%\",\"ChangeFromFiftydayMovingAverage\":\"-11.375\",\"PercentChangeFromFiftydayMovingAverage\":\"-2.08%\",\"Name\":\"Google Inc.\",\"Notes\":null,\"Open\":\"531.25\",\"PreviousClose\":\"536.99\",\"PricePaid\":null,\"ChangeinPercent\":\"-0.40%\",\"PriceSales\":\"5.36\",\"PriceBook\":\"3.69\",\"ExDividendDate\":null,\"PERatio\":\"28.26\",\"DividendPayDate\":null,\"PERatioRealtime\":null,\"PEGRatio\":\"1.34\",\"PriceEPSEstimateCurrentYear\":\"20.94\",\"PriceEPSEstimateNextYear\":\"18.26\",\"Symbol\":\"GOOG\",\"SharesOwned\":null,\"ShortRatio\":\"1.20\",\"LastTradeTime\":\"4:00pm\",\"TickerTrend\":\"&nbsp;+=====&nbsp;\",\"OneyrTargetPrice\":\"642.50\",\"Volume\":\"1558476\",\"HoldingsValue\":null,\"HoldingsValueRealtime\":null,\"YearRange\":\"502.80 - 604.83\",\"DaysValueChange\":\"- - -0.40%\",\"DaysValueChangeRealtime\":\"N/A - N/A\",\"StockExchange\":\"NasdaqNM\",\"DividendYield\":null,\"PercentChange\":\"-0.40%\"},{\"symbol\":\"MSFT\",\"Ask\":\"48.48\",\"AverageDailyVolume\":\"34126400\",\"Bid\":\"48.45\",\"AskRealtime\":\"48.48\",\"BidRealtime\":\"48.45\",\"BookValue\":\"10.923\",\"Change_PercentChange\":\"+0.48 - +1.00%\",\"Change\":\"+0.48\",\"Commission\":null,\"Currency\":\"USD\",\"ChangeRealtime\":\"+0.48\",\"AfterHoursChangeRealtime\":\"N/A - N/A\",\"DividendShare\":\"1.15\",\"LastTradeDate\":\"11/20/2014\",\"TradeDate\":null,\"EarningsShare\":\"2.551\",\"ErrorIndicationreturnedforsymbolchangedinvalid\":null,\"EPSEstimateCurrentYear\":\"2.68\",\"EPSEstimateNextYear\":\"3.14\",\"EPSEstimateNextQuarter\":\"0.69\",\"DaysLow\":\"47.87\",\"DaysHigh\":\"48.70\",\"YearLow\":\"34.63\",\"YearHigh\":\"50.05\",\"HoldingsGainPercent\":\"- - -\",\"AnnualizedGain\":null,\"HoldingsGain\":null,\"HoldingsGainPercentRealtime\":\"N/A - N/A\",\"HoldingsGainRealtime\":null,\"MoreInfo\":\"cn\",\"OrderBookRealtime\":null,\"MarketCapitalization\":\"401.4B\",\"MarketCapRealtime\":null,\"EBITDA\":\"33.261B\",\"ChangeFromYearLow\":\"+14.07\",\"PercentChangeFromYearLow\":\"+40.63%\",\"LastTradeRealtimeWithTime\":\"N/A - <b>48.70</b>\",\"ChangePercentRealtime\":\"N/A - +1.00%\",\"ChangeFromYearHigh\":\"-1.35\",\"PercebtChangeFromYearHigh\":\"-2.70%\",\"LastTradeWithTime\":\"Nov 20 - <b>48.70</b>\",\"LastTradePriceOnly\":\"48.70\",\"HighLimit\":null,\"LowLimit\":null,\"DaysRange\":\"47.87 - 48.70\",\"DaysRangeRealtime\":\"N/A - N/A\",\"FiftydayMovingAverage\":\"46.4419\",\"TwoHundreddayMovingAverage\":\"43.957\",\"ChangeFromTwoHundreddayMovingAverage\":\"+4.743\",\"PercentChangeFromTwoHundreddayMovingAverage\":\"+10.79%\",\"ChangeFromFiftydayMovingAverage\":\"+2.2581\",\"PercentChangeFromFiftydayMovingAverage\":\"+4.86%\",\"Name\":\"Microsoft Corpora\",\"Notes\":null,\"Open\":\"48.03\",\"PreviousClose\":\"48.22\",\"PricePaid\":null,\"ChangeinPercent\":\"+1.00%\",\"PriceSales\":\"4.34\",\"PriceBook\":\"4.41\",\"ExDividendDate\":\"Nov 18\",\"PERatio\":\"18.90\",\"DividendPayDate\":\"Dec 11\",\"PERatioRealtime\":null,\"PEGRatio\":\"2.75\",\"PriceEPSEstimateCurrentYear\":\"17.99\",\"PriceEPSEstimateNextYear\":\"15.36\",\"Symbol\":\"MSFT\",\"SharesOwned\":null,\"ShortRatio\":\"2.30\",\"LastTradeTime\":\"4:00pm\",\"TickerTrend\":\"&nbsp;+=====&nbsp;\",\"OneyrTargetPrice\":\"49.43\",\"Volume\":\"21507188\",\"HoldingsValue\":null,\"HoldingsValueRealtime\":null,\"YearRange\":\"34.63 - 50.05\",\"DaysValueChange\":\"- - +1.00%\",\"DaysValueChangeRealtime\":\"N/A - N/A\",\"StockExchange\":\"NasdaqNM\",\"DividendYield\":\"2.38\",\"PercentChange\":\"+1.00%\"}]}}}"

(with-redefs [client/get (fn [url] {:body "fake!"})]
(->
 (client/get
  "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22YHOO%22%2C%22AAPL%22%2C%22GOOG%22%2C%22MSFT%22)%0A%09%09&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=")
 :body
 ))


;(->
; (client/get "http://clojure.org/")
; :headers
; (get "server")
; ) ;nginx


