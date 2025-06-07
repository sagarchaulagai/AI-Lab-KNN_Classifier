# k-NN Classifier with Cross-Validation and Visualization

## 📋 Project Overview

This project implements a **k-Nearest Neighbors (k-NN) Classifier** with comprehensive cross-validation analysis and data visualization. The implementation includes both a custom k-NN algorithm and scikit-learn integration for robust model evaluation.

## 🎯 Key Features

- **Custom k-NN Implementation**: Pure Python implementation of the k-NN algorithm
- **Cross-Validation Analysis**: Automated k-value optimization using StratifiedKFold
- **Data Visualization**: Interactive plots showing data distribution and classification results
- **Dynamic k Selection**: Intelligent k-value generation based on dataset size
- **Multi-class Classification**: Supports classification into multiple categories (A, B, C)

## 📊 Dataset Description

The project uses a synthetic dataset with **40 samples** containing:
- **Features**: Age (19-45 years) and Salary (15,000-30,000)
- **Target Variable**: Three categories (A, B, C)
- **Test Point**: [24, 25000] for prediction demonstration

## 🛠️ Implementation Details

### Core Functions

#### 1. `euclidean_distance(point1, point2)`
- Calculates Euclidean distance between two points
- Foundation for k-NN distance-based classification

#### 2. `generate_k(n_samples)`
- Intelligently generates optimal k-value based on dataset size
- Uses square root rule: `k = √(n_samples)`
- Ensures k is odd to avoid tie-breaking issues

#### 3. `knn_predict(training_data, training_labels, test_point, k)`
- Custom k-NN prediction implementation
- Finds k nearest neighbors using Euclidean distance
- Returns most common label among neighbors

#### 4. `suggest_n_splits(n_samples, labels)`
- Recommends optimal number of cross-validation folds
- Considers dataset size and class distribution
- Prevents overfitting in small datasets

### Cross-Validation Process

1. **Label Encoding**: Converts categorical labels to numerical format
2. **k-Range Testing**: Evaluates odd k-values from 1 to 5
3. **StratifiedKFold**: Ensures balanced class representation in each fold
4. **Accuracy Scoring**: Uses accuracy metric for model evaluation
5. **Optimal k Selection**: Chooses k with highest cross-validation accuracy

## 📈 Visualizations

The project generates three key visualizations:

1. **Training Data Distribution**: Scatter plot showing age vs. salary with category colors
2. **Test Point Visualization**: Training data with highlighted test point
3. **Cross-Validation Results**: Line plot showing accuracy vs. k-value

## 🚀 Usage

### Prerequisites

```bash
pip install numpy matplotlib pandas seaborn scikit-learn
```

### Running the Project

```bash
python main.py
```

### Expected Output

1. **Initial Prediction**: Shows prediction for test point with default k
2. **Data Visualizations**: Three matplotlib plots
3. **Cross-Validation Results**: Best k-value and accuracy scores

## 🔧 Technical Specifications

### Dependencies
- **NumPy**: Numerical computations and array operations
- **Matplotlib**: Plotting and visualization
- **Pandas**: Data manipulation and analysis
- **Seaborn**: Enhanced statistical visualizations
- **Scikit-learn**: Machine learning algorithms and cross-validation

### Algorithm Parameters
- **Distance Metric**: Euclidean distance
- **k-Range**: 1, 3, 5 (odd values only)
- **Cross-Validation**: 3-fold StratifiedKFold
- **Random State**: 42 (for reproducibility)

## 📊 Results Interpretation

### Cross-Validation Analysis
- Evaluates model performance across different k-values
- Helps identify optimal hyperparameter
- Prevents overfitting through systematic validation

### Visualization Insights
- **Data Distribution**: Shows clustering patterns in age-salary space
- **Test Point Location**: Visualizes prediction context
- **Model Performance**: Demonstrates k-value impact on accuracy

## 🎓 Learning Objectives

This project demonstrates:
- **k-NN Algorithm**: Understanding distance-based classification
- **Cross-Validation**: Model evaluation and hyperparameter tuning
- **Data Visualization**: Effective communication of results
- **Machine Learning Workflow**: End-to-end ML project implementation

## 📝 Code Structure

```
main.py
├── Utility Functions
│   ├── euclidean_distance()
│   ├── generate_k()
│   ├── knn_predict()
│   └── suggest_n_splits()
├── Data Definition
│   ├── Training Data (40 samples)
│   ├── Training Labels (A, B, C)
│   └── Test Point
├── Initial Prediction
├── Data Visualization
└── Cross-Validation Analysis
```

## 🔍 Key Insights

1. **k-Selection**: The square root rule provides a good starting point for k-value selection
2. **Cross-Validation**: Essential for unbiased model evaluation
3. **Visualization**: Critical for understanding data patterns and model behavior
4. **Custom Implementation**: Helps understand the underlying algorithm mechanics

## 📚 References

- Scikit-learn Documentation: k-NN Classifier
- Machine Learning Fundamentals: Cross-Validation
- Data Visualization Best Practices

---

**Author**: Lab 2 - AI/ML Project  
**Date**: 2024  
**Course**: Artificial Intelligence / Machine Learning
