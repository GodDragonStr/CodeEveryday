import rasterio

# 打开TIFF文件
file_path = r'D:\Repositery\CodeEveryday\CVCode\visual\vis_tif\N32E119_2022_sl_HH_F02DAR.tif'
with rasterio.open(file_path) as src:
    # 读取所有波段的数据
    data = src.read(1)

    # 获取元数据信息
    metadata = src.meta

# 输出数据的形状
print("数据形状:", data.shape)

# 输出元数据信息
print("元数据信息:", metadata)