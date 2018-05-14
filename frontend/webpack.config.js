var path = require('path');
var webpack = require('webpack');
var HtmlWebpackPlugin = require('html-webpack-plugin');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

module.exports = {
  devtool: 'source-map',
  context: path.join(__dirname, 'src'),
  entry: {
    app: './index.js'
  },
  output: {
    path: path.join(__dirname, 'dist'),
    filename: '[name].bundle.js'
  },
  plugins: [
    new webpack.optimize.CommonsChunkPlugin({
      name: 'commons',
      filename: 'commons.js'
    }),
    new HtmlWebpackPlugin({
      title: 'URL shortener',
      template: path.join(__dirname, 'assets/index-template.html')
    }),
    new webpack.DefinePlugin({
      'process.env': {
        NODE_ENV: JSON.stringify('production')
      }
    }),
    new ExtractTextPlugin({
      filename: 'app.css',
      allChunks: true
    })
  ],
  resolve: {
    extensions: ['*', '.js'],
    modules: [path.join(__dirname, 'src'), 'node_modules']
  },
  module: {
    rules: [
      {
        test: /\.css$/,
        use: ExtractTextPlugin.extract({
          fallback: 'style-loader', use: ['css-loader?modules&importLoaders=1&localIdentName=[name]__[local]___[hash:base64:5]', 'postcss-loader']
        })
      },
      {
        test: /\.js$/,
        exclude: /node_modules/,
        loader: 'babel-loader',
        include: path.join(__dirname, 'src')
      }
    ]
  }
};
