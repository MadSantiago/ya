package p000;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: ۦۙؓٙؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5099 {

    /* JADX INFO: renamed from: ۥؓ */
    public static final String[] f16895;

    /* JADX INFO: renamed from: ۥؔ */
    public static final byte[] f16896;

    /* JADX INFO: renamed from: ۥؖ */
    public static final byte[] f16897;

    /* JADX INFO: renamed from: ۥً */
    public static final byte[] f16898;

    /* JADX INFO: renamed from: ۥَ */
    public static final byte[] f16899;

    /* JADX INFO: renamed from: ۥْ */
    public static final byte[] f16900;

    /* JADX INFO: renamed from: ۥٓ */
    public static final byte[] f16901;

    /* JADX INFO: renamed from: ۥٕ */
    public static final C5527[][] f16902;

    /* JADX INFO: renamed from: ۥٖ */
    public static final byte[] f16903;

    /* JADX INFO: renamed from: ۥٙ */
    public static final byte[] f16904;

    /* JADX INFO: renamed from: ۥۖ */
    public static final byte[] f16905;

    /* JADX INFO: renamed from: ۥۙ */
    public static final C5527[] f16906;

    /* JADX INFO: renamed from: ۥۦ */
    public static final HashSet f16907;

    /* JADX INFO: renamed from: ۥۧ */
    public static final int[] f16908;

    /* JADX INFO: renamed from: ۦؖ */
    public static final HashMap[] f16909;

    /* JADX INFO: renamed from: ۦؗ */
    public static final HashMap f16910;

    /* JADX INFO: renamed from: ۦؙ */
    public static final HashMap[] f16911;

    /* JADX INFO: renamed from: ۦؚ */
    public static final int[] f16912;

    /* JADX INFO: renamed from: ۦٌ */
    public static final int[] f16913;

    /* JADX INFO: renamed from: ۦُ */
    public static final Charset f16914;

    /* JADX INFO: renamed from: ۦٕ */
    public static final byte[] f16915;

    /* JADX INFO: renamed from: ۦٖ */
    public static final byte[] f16916;

    /* JADX INFO: renamed from: ۦٗ */
    public static final byte[] f16917;

    /* JADX INFO: renamed from: ۦٚ */
    public static final C5527 f16918;

    /* JADX INFO: renamed from: ۦۗ */
    public static final boolean f16919 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ۦۚ */
    public static final byte[] f16920;

    /* JADX INFO: renamed from: ۦۛ */
    public static final byte[] f16921;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final byte[] f16922;

    /* JADX INFO: renamed from: ۦۨ */
    public static final byte[] f16923;

    /* JADX INFO: renamed from: ۥؗ */
    public final HashMap[] f16924;

    /* JADX INFO: renamed from: ۥُ */
    public ByteOrder f16925;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f16926;

    /* JADX INFO: renamed from: ۥۗ */
    public int f16927;

    /* JADX INFO: renamed from: ۥۜ */
    public int f16928;

    /* JADX INFO: renamed from: ۥۣ */
    public final FileDescriptor f16929;

    /* JADX INFO: renamed from: ۦؑ */
    public final HashSet f16930;

    /* JADX INFO: renamed from: ۦِ */
    public int f16931;

    /* JADX INFO: renamed from: ۦٛ */
    public int f16932;

    /* JADX INFO: renamed from: ۦۙ */
    public int f16933;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f16912 = new int[]{8, 8, 8};
        f16913 = new int[]{8};
        f16920 = new byte[]{-1, -40, -1};
        f16923 = new byte[]{102, 116, 121, 112};
        f16922 = new byte[]{109, 105, 102, 49};
        f16900 = new byte[]{104, 101, 105, 99};
        f16901 = new byte[]{79, 76, 89, 77, 80, 0};
        f16899 = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f16903 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f16917 = new byte[]{101, 88, 73, 102};
        f16921 = new byte[]{73, 72, 68, 82};
        f16905 = new byte[]{73, 69, 78, 68};
        f16915 = new byte[]{82, 73, 70, 70};
        f16904 = new byte[]{87, 69, 66, 80};
        f16897 = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f16895 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f16908 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f16898 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C5527[] c5527Arr = {new C5527(254, 4, "NewSubfileType"), new C5527(255, 4, "SubfileType"), new C5527("ImageWidth", 256, 3, 4), new C5527("ImageLength", 257, 3, 4), new C5527(258, 3, "BitsPerSample"), new C5527(259, 3, "Compression"), new C5527(262, 3, "PhotometricInterpretation"), new C5527(270, 2, "ImageDescription"), new C5527(271, 2, "Make"), new C5527(272, 2, "Model"), new C5527("StripOffsets", 273, 3, 4), new C5527(274, 3, "Orientation"), new C5527(277, 3, "SamplesPerPixel"), new C5527("RowsPerStrip", 278, 3, 4), new C5527("StripByteCounts", 279, 3, 4), new C5527(282, 5, "XResolution"), new C5527(283, 5, "YResolution"), new C5527(284, 3, "PlanarConfiguration"), new C5527(296, 3, "ResolutionUnit"), new C5527(301, 3, "TransferFunction"), new C5527(305, 2, "Software"), new C5527(306, 2, "DateTime"), new C5527(315, 2, "Artist"), new C5527(318, 5, "WhitePoint"), new C5527(319, 5, "PrimaryChromaticities"), new C5527(330, 4, "SubIFDPointer"), new C5527(513, 4, "JPEGInterchangeFormat"), new C5527(514, 4, "JPEGInterchangeFormatLength"), new C5527(529, 5, "YCbCrCoefficients"), new C5527(530, 3, "YCbCrSubSampling"), new C5527(531, 3, "YCbCrPositioning"), new C5527(532, 5, "ReferenceBlackWhite"), new C5527(33432, 2, "Copyright"), new C5527(34665, 4, "ExifIFDPointer"), new C5527(34853, 4, "GPSInfoIFDPointer"), new C5527(4, 4, "SensorTopBorder"), new C5527(5, 4, "SensorLeftBorder"), new C5527(6, 4, "SensorBottomBorder"), new C5527(7, 4, "SensorRightBorder"), new C5527(23, 3, "ISO"), new C5527(46, 7, "JpgFromRaw"), new C5527(700, 1, "Xmp")};
        C5527[] c5527Arr2 = {new C5527(33434, 5, "ExposureTime"), new C5527(33437, 5, "FNumber"), new C5527(34850, 3, "ExposureProgram"), new C5527(34852, 2, "SpectralSensitivity"), new C5527(34855, 3, "PhotographicSensitivity"), new C5527(34856, 7, "OECF"), new C5527(34864, 3, "SensitivityType"), new C5527(34865, 4, "StandardOutputSensitivity"), new C5527(34866, 4, "RecommendedExposureIndex"), new C5527(34867, 4, "ISOSpeed"), new C5527(34868, 4, "ISOSpeedLatitudeyyy"), new C5527(34869, 4, "ISOSpeedLatitudezzz"), new C5527(36864, 2, "ExifVersion"), new C5527(36867, 2, "DateTimeOriginal"), new C5527(36868, 2, "DateTimeDigitized"), new C5527(36880, 2, "OffsetTime"), new C5527(36881, 2, "OffsetTimeOriginal"), new C5527(36882, 2, "OffsetTimeDigitized"), new C5527(37121, 7, "ComponentsConfiguration"), new C5527(37122, 5, "CompressedBitsPerPixel"), new C5527(37377, 10, "ShutterSpeedValue"), new C5527(37378, 5, "ApertureValue"), new C5527(37379, 10, "BrightnessValue"), new C5527(37380, 10, "ExposureBiasValue"), new C5527(37381, 5, "MaxApertureValue"), new C5527(37382, 5, "SubjectDistance"), new C5527(37383, 3, "MeteringMode"), new C5527(37384, 3, "LightSource"), new C5527(37385, 3, "Flash"), new C5527(37386, 5, "FocalLength"), new C5527(37396, 3, "SubjectArea"), new C5527(37500, 7, "MakerNote"), new C5527(37510, 7, "UserComment"), new C5527(37520, 2, "SubSecTime"), new C5527(37521, 2, "SubSecTimeOriginal"), new C5527(37522, 2, "SubSecTimeDigitized"), new C5527(40960, 7, "FlashpixVersion"), new C5527(40961, 3, "ColorSpace"), new C5527("PixelXDimension", 40962, 3, 4), new C5527("PixelYDimension", 40963, 3, 4), new C5527(40964, 2, "RelatedSoundFile"), new C5527(40965, 4, "InteroperabilityIFDPointer"), new C5527(41483, 5, "FlashEnergy"), new C5527(41484, 7, "SpatialFrequencyResponse"), new C5527(41486, 5, "FocalPlaneXResolution"), new C5527(41487, 5, "FocalPlaneYResolution"), new C5527(41488, 3, "FocalPlaneResolutionUnit"), new C5527(41492, 3, "SubjectLocation"), new C5527(41493, 5, "ExposureIndex"), new C5527(41495, 3, "SensingMethod"), new C5527(41728, 7, "FileSource"), new C5527(41729, 7, "SceneType"), new C5527(41730, 7, "CFAPattern"), new C5527(41985, 3, "CustomRendered"), new C5527(41986, 3, "ExposureMode"), new C5527(41987, 3, "WhiteBalance"), new C5527(41988, 5, "DigitalZoomRatio"), new C5527(41989, 3, "FocalLengthIn35mmFilm"), new C5527(41990, 3, "SceneCaptureType"), new C5527(41991, 3, "GainControl"), new C5527(41992, 3, "Contrast"), new C5527(41993, 3, "Saturation"), new C5527(41994, 3, "Sharpness"), new C5527(41995, 7, "DeviceSettingDescription"), new C5527(41996, 3, "SubjectDistanceRange"), new C5527(42016, 2, "ImageUniqueID"), new C5527(42032, 2, "CameraOwnerName"), new C5527(42033, 2, "BodySerialNumber"), new C5527(42034, 5, "LensSpecification"), new C5527(42035, 2, "LensMake"), new C5527(42036, 2, "LensModel"), new C5527(42240, 5, "Gamma"), new C5527(50706, 1, "DNGVersion"), new C5527("DefaultCropSize", 50720, 3, 4)};
        C5527[] c5527Arr3 = {new C5527(0, 1, "GPSVersionID"), new C5527(1, 2, "GPSLatitudeRef"), new C5527("GPSLatitude", 2, 5, 10), new C5527(3, 2, "GPSLongitudeRef"), new C5527("GPSLongitude", 4, 5, 10), new C5527(5, 1, "GPSAltitudeRef"), new C5527(6, 5, "GPSAltitude"), new C5527(7, 5, "GPSTimeStamp"), new C5527(8, 2, "GPSSatellites"), new C5527(9, 2, "GPSStatus"), new C5527(10, 2, "GPSMeasureMode"), new C5527(11, 5, "GPSDOP"), new C5527(12, 2, "GPSSpeedRef"), new C5527(13, 5, "GPSSpeed"), new C5527(14, 2, "GPSTrackRef"), new C5527(15, 5, "GPSTrack"), new C5527(16, 2, "GPSImgDirectionRef"), new C5527(17, 5, "GPSImgDirection"), new C5527(18, 2, "GPSMapDatum"), new C5527(19, 2, "GPSDestLatitudeRef"), new C5527(20, 5, "GPSDestLatitude"), new C5527(21, 2, "GPSDestLongitudeRef"), new C5527(22, 5, "GPSDestLongitude"), new C5527(23, 2, "GPSDestBearingRef"), new C5527(24, 5, "GPSDestBearing"), new C5527(25, 2, "GPSDestDistanceRef"), new C5527(26, 5, "GPSDestDistance"), new C5527(27, 7, "GPSProcessingMethod"), new C5527(28, 7, "GPSAreaInformation"), new C5527(29, 2, "GPSDateStamp"), new C5527(30, 3, "GPSDifferential"), new C5527(31, 5, "GPSHPositioningError")};
        C5527[] c5527Arr4 = {new C5527(1, 2, "InteroperabilityIndex")};
        C5527[] c5527Arr5 = {new C5527(254, 4, "NewSubfileType"), new C5527(255, 4, "SubfileType"), new C5527("ThumbnailImageWidth", 256, 3, 4), new C5527("ThumbnailImageLength", 257, 3, 4), new C5527(258, 3, "BitsPerSample"), new C5527(259, 3, "Compression"), new C5527(262, 3, "PhotometricInterpretation"), new C5527(270, 2, "ImageDescription"), new C5527(271, 2, "Make"), new C5527(272, 2, "Model"), new C5527("StripOffsets", 273, 3, 4), new C5527(274, 3, "ThumbnailOrientation"), new C5527(277, 3, "SamplesPerPixel"), new C5527("RowsPerStrip", 278, 3, 4), new C5527("StripByteCounts", 279, 3, 4), new C5527(282, 5, "XResolution"), new C5527(283, 5, "YResolution"), new C5527(284, 3, "PlanarConfiguration"), new C5527(296, 3, "ResolutionUnit"), new C5527(301, 3, "TransferFunction"), new C5527(305, 2, "Software"), new C5527(306, 2, "DateTime"), new C5527(315, 2, "Artist"), new C5527(318, 5, "WhitePoint"), new C5527(319, 5, "PrimaryChromaticities"), new C5527(330, 4, "SubIFDPointer"), new C5527(513, 4, "JPEGInterchangeFormat"), new C5527(514, 4, "JPEGInterchangeFormatLength"), new C5527(529, 5, "YCbCrCoefficients"), new C5527(530, 3, "YCbCrSubSampling"), new C5527(531, 3, "YCbCrPositioning"), new C5527(532, 5, "ReferenceBlackWhite"), new C5527(33432, 2, "Copyright"), new C5527(34665, 4, "ExifIFDPointer"), new C5527(34853, 4, "GPSInfoIFDPointer"), new C5527(50706, 1, "DNGVersion"), new C5527("DefaultCropSize", 50720, 3, 4)};
        f16918 = new C5527(273, 3, "StripOffsets");
        f16902 = new C5527[][]{c5527Arr, c5527Arr2, c5527Arr3, c5527Arr4, c5527Arr5, c5527Arr, new C5527[]{new C5527(256, 7, "ThumbnailImage"), new C5527(8224, 4, "CameraSettingsIFDPointer"), new C5527(8256, 4, "ImageProcessingIFDPointer")}, new C5527[]{new C5527(257, 4, "PreviewImageStart"), new C5527(258, 4, "PreviewImageLength")}, new C5527[]{new C5527(4371, 3, "AspectFrame")}, new C5527[]{new C5527(55, 3, "ColorSpace")}};
        f16906 = new C5527[]{new C5527(330, 4, "SubIFDPointer"), new C5527(34665, 4, "ExifIFDPointer"), new C5527(34853, 4, "GPSInfoIFDPointer"), new C5527(40965, 4, "InteroperabilityIFDPointer"), new C5527(8224, 1, "CameraSettingsIFDPointer"), new C5527(8256, 1, "ImageProcessingIFDPointer")};
        f16911 = new HashMap[10];
        f16909 = new HashMap[10];
        f16907 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f16910 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f16914 = charsetForName;
        f16916 = "Exif\u0000\u0000".getBytes(charsetForName);
        f16896 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C5527[][] c5527Arr6 = f16902;
            if (i >= c5527Arr6.length) {
                HashMap map = f16910;
                C5527[] c5527Arr7 = f16906;
                map.put(Integer.valueOf(c5527Arr7[0].f18248), 5);
                map.put(Integer.valueOf(c5527Arr7[1].f18248), 1);
                map.put(Integer.valueOf(c5527Arr7[2].f18248), 2);
                map.put(Integer.valueOf(c5527Arr7[3].f18248), 3);
                map.put(Integer.valueOf(c5527Arr7[4].f18248), 7);
                map.put(Integer.valueOf(c5527Arr7[5].f18248), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f16911[i] = new HashMap();
            f16909[i] = new HashMap();
            for (C5527 c5527 : c5527Arr6[i]) {
                f16911[i].put(Integer.valueOf(c5527.f18248), c5527);
                f16909[i].put(c5527.f18247, c5527);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:12:0x0037, B:18:0x0054, B:20:0x005f, B:28:0x0075, B:23:0x0066, B:26:0x006e, B:27:0x0072, B:29:0x007f, B:31:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009a, B:42:0x00a8), top: B:52:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public C5099(C1739 c1739) {
        C5527[][] c5527Arr = f16902;
        this.f16924 = new HashMap[c5527Arr.length];
        this.f16930 = new HashSet(c5527Arr.length);
        this.f16925 = ByteOrder.BIG_ENDIAN;
        boolean z = f16919;
        this.f16929 = null;
        for (int i = 0; i < c5527Arr.length; i++) {
            try {
                try {
                    this.f16924[i] = new HashMap();
                } catch (IOException e) {
                    e = e;
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m8716();
                    if (!z) {
                        return;
                    }
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m8716();
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m8716();
                if (z) {
                    m8728();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c1739, 5000);
        int iM8710 = m8710(bufferedInputStream);
        this.f16927 = iM8710;
        if (iM8710 == 4 || iM8710 == 9 || iM8710 == 13 || iM8710 == 14) {
            C3380 c3380 = new C3380(bufferedInputStream);
            int i2 = this.f16927;
            if (i2 == 4) {
                m8709(c3380, 0, 0);
            } else if (i2 == 13) {
                m8715(c3380);
            } else if (i2 == 9) {
                m8723(c3380);
            } else if (i2 == 14) {
                m8718(c3380);
            }
        } else {
            C3438 c3438 = new C3438(bufferedInputStream);
            int i3 = this.f16927;
            if (i3 == 12) {
                m8717(c3438);
            } else if (i3 == 7) {
                m8725(c3438);
            } else if (i3 == 10) {
                m8724(c3438);
            } else {
                m8720(c3438);
            }
            c3438.m6222(this.f16933);
            m8722(c3438);
        }
        m8716();
        if (!z) {
            return;
        }
        m8728();
    }

    /* JADX INFO: renamed from: ۥْ */
    public static ByteOrder m8706(C3380 c3380) throws IOException {
        short s = c3380.readShort();
        boolean z = f16919;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            C5028.m8452(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C2006 m8707(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f16919) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f16902.length; i++) {
            C2006 c2006 = (C2006) this.f16924[i].get(str);
            if (c2006 != null) {
                return c2006;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:148:0x0328  */
    /* JADX WARN: Code duplicated, block: B:175:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    /* JADX INFO: renamed from: ۥَ */
    public final void m8708(C3438 c3438, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strM6634;
        int i3;
        int i4 = c3438.f11271;
        int i5 = c3438.f11268;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.f16930;
        hashSet2.add(numValueOf);
        short s = c3438.readShort();
        boolean z2 = f16919;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f16924;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = c3438.readUnsignedShort();
            int unsignedShort3 = c3438.readUnsignedShort();
            int i6 = c3438.readInt();
            long j6 = ((long) c3438.f11271) + 4;
            short s3 = s;
            C5527 c5527 = (C5527) f16911[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c5527 != null ? c5527.f18247 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (c5527 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f16908;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = c5527.f18246;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = c5527.f18249) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f16895[unsignedShort3] + ") is unexpected for tag: " + c5527.f18247);
                        }
                    }
                    if (z) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = c3438.readInt();
                            if (z2 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.f16927 == 7) {
                                if ("MakerNote".equals(c5527.f18247)) {
                                    this.f16928 = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(c5527.f18247)) {
                                    this.f16932 = i3;
                                    this.f16931 = i6;
                                    C2006 c2006M3910 = C2006.m3910(6, this.f16925);
                                    C2006 c2006M3912 = C2006.m3912(this.f16932, this.f16925);
                                    C2006 c2006M3913 = C2006.m3912(this.f16931, this.f16925);
                                    mapArr[4].put("Compression", c2006M3910);
                                    mapArr[4].put("JPEGInterchangeFormat", c2006M3912);
                                    mapArr[4].put("JPEGInterchangeFormatLength", c2006M3913);
                                }
                            }
                            c3438.m6222(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            c5527 = c5527;
                        }
                        num = (Integer) f16910.get(Integer.valueOf(unsignedShort2));
                        if (z2 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) c3438.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = c3438.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = c3438.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z2 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c5527.f18247));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z2 != 0) {
                                        strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i5 != -1) {
                                            strM6634 = strM6634 + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strM6634);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        c3438.m6222(j5);
                                        m8708(c3438, num.intValue());
                                    } else if (z2 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                c3438.m6222(j3);
                            } else {
                                unsignedShort = c3438.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c5527.f18247));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strM6634 = strM6634 + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM6634);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strM6634 = strM6634 + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM6634);
                                }
                            }
                            c3438.m6222(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i8 = c3438.f11271 + this.f16933;
                            byte[] bArr = new byte[(int) j2];
                            c3438.readFully(bArr);
                            C2006 c2006 = new C2006(i8, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = c5527.f18247;
                            map.put(str, c2006);
                            if ("DNGVersion".equals(str)) {
                                this.f16927 = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && c2006.m3914(this.f16925).contains("PENTAX")) || ("Compression".equals(str) && c2006.m3913(this.f16925) == 65535)) {
                                this.f16927 = 8;
                            }
                            if (c3438.f11271 != j4) {
                                c3438.m6222(j4);
                            }
                        }
                    } else {
                        c3438.m6222(j);
                        hashSet = hashSet2;
                    }
                    s2 = (short) (s2 + 1);
                    hashSet2 = hashSet;
                    s = s3;
                    z2 = z2;
                }
                j = j6;
                if (z2 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z = false;
                if (z) {
                    c3438.m6222(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = c3438.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.f16927 == 7) {
                            if ("MakerNote".equals(c5527.f18247)) {
                                this.f16928 = i3;
                            } else if (i != 6) {
                            }
                        }
                        c3438.m6222(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        c5527 = c5527;
                    }
                    num = (Integer) f16910.get(Integer.valueOf(unsignedShort2));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) c3438.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = c3438.readInt();
                            } else {
                                unsignedShort = c3438.readShort();
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c5527.f18247));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strM6634 = strM6634 + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM6634);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strM6634 = strM6634 + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM6634);
                                }
                            }
                            c3438.m6222(j3);
                        } else {
                            unsignedShort = c3438.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c5527.f18247));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strM6634 = strM6634 + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM6634);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strM6634 = strM6634 + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM6634);
                            }
                        }
                        c3438.m6222(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i9 = c3438.f11271 + this.f16933;
                        byte[] bArr2 = new byte[(int) j2];
                        c3438.readFully(bArr2);
                        C2006 c2007 = new C2006(i9, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = c5527.f18247;
                        map2.put(str, c2007);
                        if ("DNGVersion".equals(str)) {
                            this.f16927 = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f16927 = 8;
                        if (c3438.f11271 != j4) {
                            c3438.m6222(j4);
                        }
                    }
                }
                s2 = (short) (s2 + 1);
                hashSet2 = hashSet;
                s = s3;
                z2 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z = false;
            if (z) {
                c3438.m6222(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = c3438.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.f16927 == 7) {
                        if ("MakerNote".equals(c5527.f18247)) {
                            this.f16928 = i3;
                        } else if (i != 6) {
                        }
                    }
                    c3438.m6222(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    c5527 = c5527;
                }
                num = (Integer) f16910.get(Integer.valueOf(unsignedShort2));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) c3438.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = c3438.readInt();
                        } else {
                            unsignedShort = c3438.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c5527.f18247));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strM6634 = strM6634 + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM6634);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strM6634 = strM6634 + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM6634);
                            }
                        }
                        c3438.m6222(j3);
                    } else {
                        unsignedShort = c3438.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c5527.f18247));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z2 != 0) {
                            strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strM6634 = strM6634 + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strM6634);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z2 != 0) {
                            strM6634 = AbstractC3761.m6634(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strM6634 = strM6634 + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strM6634);
                        }
                    }
                    c3438.m6222(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i10 = c3438.f11271 + this.f16933;
                    byte[] bArr3 = new byte[(int) j2];
                    c3438.readFully(bArr3);
                    C2006 c2008 = new C2006(i10, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = c5527.f18247;
                    map3.put(str, c2008);
                    if ("DNGVersion".equals(str)) {
                        this.f16927 = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f16927 = 8;
                    if (c3438.f11271 != j4) {
                        c3438.m6222(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s = s3;
            z2 = z2;
        }
        HashSet hashSet3 = hashSet2;
        boolean z3 = z2;
        int i11 = c3438.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        c3438.m6222(j7);
        if (mapArr[4].isEmpty()) {
            m8708(c3438, 4);
        } else if (mapArr[5].isEmpty()) {
            m8708(c3438, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b A[LOOP:2: B:65:0x0131->B:70:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x017f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: ۥُ */
    public final void m8709(p000.C3380 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5099.m8709(ۦؘؖؖٝ, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:121:0x015b A[LOOP:3: B:116:0x014f->B:121:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x016f A[LOOP:4: B:123:0x0160->B:128:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0175 A[LOOP:2: B:111:0x0142->B:131:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x017d  */
    /* JADX WARN: Code duplicated, block: B:154:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x016e A[EDGE_INSN: B:168:0x016e->B:127:0x016e BREAK  A[LOOP:3: B:116:0x014f->B:121:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x016e A[EDGE_INSN: B:170:0x016e->B:127:0x016e BREAK  A[LOOP:3: B:116:0x014f->B:121:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX INFO: renamed from: ۥّ */
    public final int m8710(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        C3380 c3380;
        C3380 c3381;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        C3380 c3382;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = f16920;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    byte b = bArr4[i8];
                    ?? r7 = bytes[i8];
                    if (b != r7) {
                        ?? r4 = 0;
                        C3380 c3383 = null;
                        C3380 c3384 = null;
                        C3380 c3385 = null;
                        try {
                            try {
                                try {
                                    try {
                                        c3380 = new C3380(bArr4);
                                        try {
                                            long j2 = c3380.readInt();
                                            byte[] bArr6 = new byte[4];
                                            c3380.readFully(bArr6);
                                            if (Arrays.equals(bArr6, f16923)) {
                                                if (j2 == 1) {
                                                    j2 = c3380.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    boolean z = false;
                                                    boolean z2 = false;
                                                    for (long j4 = 0; j4 < j3 / 4; j4++) {
                                                        try {
                                                            c3380.readFully(bArr7);
                                                            if (j4 != 1) {
                                                                i = 0;
                                                                try {
                                                                    if (Arrays.equals(bArr7, f16922)) {
                                                                        z = true;
                                                                    } else if (Arrays.equals(bArr7, f16900)) {
                                                                        z2 = true;
                                                                    }
                                                                    if (z && z2) {
                                                                        c3380.close();
                                                                        return 12;
                                                                    }
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                }
                                                            }
                                                        } catch (EOFException unused) {
                                                        }
                                                    }
                                                    i = 0;
                                                    c3380.close();
                                                    c3381 = new C3380(bArr4);
                                                    ByteOrder byteOrderM8706 = m8706(c3381);
                                                    this.f16925 = byteOrderM8706;
                                                    c3381.f11269 = byteOrderM8706;
                                                    s = c3381.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    c3381.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        c3382 = new C3380(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM8707 = m8706(c3382);
                                                            this.f16925 = byteOrderM8707;
                                                            c3382.f11269 = byteOrderM8707;
                                                            i3 = c3382.readShort() != 85 ? i : 1;
                                                            c3382.close();
                                                        } catch (Exception unused2) {
                                                            c3383 = c3382;
                                                            if (c3383 != null) {
                                                                c3383.close();
                                                            }
                                                            i3 = i;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c3384 = c3382;
                                                            if (c3384 != null) {
                                                                c3384.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused3) {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f16903;
                                                        if (i4 >= bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = f16915;
                                                                if (i5 >= bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = f16904;
                                                                        if (i6 >= bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                                if (f16919) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (c3380 != null) {
                                                    c3380.close();
                                                }
                                                c3381 = new C3380(bArr4);
                                                ByteOrder byteOrderM8708 = m8706(c3381);
                                                this.f16925 = byteOrderM8708;
                                                c3381.f11269 = byteOrderM8708;
                                                s = c3381.readShort();
                                                if (s != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                c3381.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                c3382 = new C3380(bArr4);
                                                ByteOrder byteOrderM8709 = m8706(c3382);
                                                this.f16925 = byteOrderM8709;
                                                c3382.f11269 = byteOrderM8709;
                                                if (c3382.readShort() != 85) {
                                                }
                                                c3382.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = f16903;
                                                    if (i4 >= bArr.length) {
                                                        return 13;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        while (true) {
                                                            bArr2 = f16915;
                                                            if (i5 >= bArr2.length) {
                                                                i6 = i;
                                                                while (true) {
                                                                    bArr3 = f16904;
                                                                    if (i6 >= bArr3.length) {
                                                                        return 14;
                                                                    }
                                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            } else {
                                                                if (bArr4[i5] != bArr2[i5]) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i5++;
                                                            }
                                                        }
                                                        return i;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            c3380.close();
                                            i = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i = 0;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        i = 0;
                                        c3380 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (r4 != 0) {
                                            r4.close();
                                        }
                                        throw th;
                                    }
                                    ByteOrder byteOrderM87010 = m8706(c3381);
                                    this.f16925 = byteOrderM87010;
                                    c3381.f11269 = byteOrderM87010;
                                    s = c3381.readShort();
                                    if (s != 20306) {
                                        i2 = 1;
                                    } else {
                                        i2 = 1;
                                    }
                                    c3381.close();
                                } catch (Exception unused4) {
                                    if (c3381 != null) {
                                        c3381.close();
                                    }
                                    i2 = i;
                                } catch (Throwable th4) {
                                    th = th4;
                                    c3385 = c3381;
                                    if (c3385 != null) {
                                        c3385.close();
                                    }
                                    throw th;
                                }
                                c3381 = new C3380(bArr4);
                            } catch (Exception unused5) {
                                c3381 = null;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            if (i2 != 0) {
                                return 7;
                            }
                            c3382 = new C3380(bArr4);
                            ByteOrder byteOrderM87011 = m8706(c3382);
                            this.f16925 = byteOrderM87011;
                            c3382.f11269 = byteOrderM87011;
                            if (c3382.readShort() != 85) {
                            }
                            c3382.close();
                            if (i3 != 0) {
                                return 10;
                            }
                            i4 = i;
                            while (true) {
                                bArr = f16903;
                                if (i4 >= bArr.length) {
                                    return 13;
                                }
                                if (bArr4[i4] != bArr[i4]) {
                                    i5 = i;
                                    while (true) {
                                        bArr2 = f16915;
                                        if (i5 >= bArr2.length) {
                                            i6 = i;
                                            while (true) {
                                                bArr3 = f16904;
                                                if (i6 >= bArr3.length) {
                                                    return 14;
                                                }
                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                    break;
                                                    break;
                                                }
                                                i6++;
                                            }
                                        } else {
                                            if (bArr4[i5] != bArr2[i5]) {
                                                break;
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    return i;
                                }
                                i4++;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r4 = r7;
                            if (r4 != 0) {
                                r4.close();
                            }
                            throw th;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m8711(int i, byte[] bArr) throws IOException {
        C3438 c3438 = new C3438(bArr);
        m8729(c3438);
        m8708(c3438, i);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m8712(int i, String str, String str2) {
        HashMap[] mapArr = this.f16924;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m8713(C3438 c3438, int i) throws Throwable {
        C2006 c2006M3910;
        C2006 c2006M3911;
        HashMap[] mapArr = this.f16924;
        C2006 c2006 = (C2006) mapArr[i].get("DefaultCropSize");
        C2006 c2007 = (C2006) mapArr[i].get("SensorTopBorder");
        C2006 c2008 = (C2006) mapArr[i].get("SensorLeftBorder");
        C2006 c2009 = (C2006) mapArr[i].get("SensorBottomBorder");
        C2006 c20010 = (C2006) mapArr[i].get("SensorRightBorder");
        if (c2006 != null) {
            int i2 = c2006.f6621;
            ByteOrder byteOrder = this.f16925;
            if (i2 == 5) {
                C3167[] c3167Arr = (C3167[]) c2006.m3916(byteOrder);
                if (c3167Arr == null || c3167Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c3167Arr));
                    return;
                }
                c2006M3910 = C2006.m3911(c3167Arr[0], this.f16925);
                c2006M3911 = C2006.m3911(c3167Arr[1], this.f16925);
            } else {
                int[] iArr = (int[]) c2006.m3916(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c2006M3910 = C2006.m3910(iArr[0], this.f16925);
                c2006M3911 = C2006.m3910(iArr[1], this.f16925);
            }
            mapArr[i].put("ImageWidth", c2006M3910);
            mapArr[i].put("ImageLength", c2006M3911);
            return;
        }
        if (c2007 != null && c2008 != null && c2009 != null && c20010 != null) {
            int iM3913 = c2007.m3913(this.f16925);
            int iM3914 = c2009.m3913(this.f16925);
            int iM3915 = c20010.m3913(this.f16925);
            int iM3916 = c2008.m3913(this.f16925);
            if (iM3914 <= iM3913 || iM3915 <= iM3916) {
                return;
            }
            C2006 c2006M3912 = C2006.m3910(iM3914 - iM3913, this.f16925);
            C2006 c2006M3913 = C2006.m3910(iM3915 - iM3916, this.f16925);
            mapArr[i].put("ImageLength", c2006M3912);
            mapArr[i].put("ImageWidth", c2006M3913);
            return;
        }
        C2006 c20011 = (C2006) mapArr[i].get("ImageLength");
        C2006 c20012 = (C2006) mapArr[i].get("ImageWidth");
        if (c20011 == null || c20012 == null) {
            C2006 c20013 = (C2006) mapArr[i].get("JPEGInterchangeFormat");
            C2006 c20014 = (C2006) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c20013 == null || c20014 == null) {
                return;
            }
            int iM3917 = c20013.m3913(this.f16925);
            int iM3918 = c20013.m3913(this.f16925);
            c3438.m6222(iM3917);
            byte[] bArr = new byte[iM3918];
            c3438.readFully(bArr);
            m8709(new C3380(bArr), iM3917, i);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final String m8714(String str) {
        C2006 c2006M8707 = m8707(str);
        if (c2006M8707 != null) {
            int i = c2006M8707.f6621;
            if (!f16907.contains(str)) {
                return c2006M8707.m3914(this.f16925);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C3167[] c3167Arr = (C3167[]) c2006M8707.m3916(this.f16925);
                if (c3167Arr == null || c3167Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c3167Arr));
                    return null;
                }
                C3167 c3167 = c3167Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c3167.f10656 / c3167.f10655));
                C3167 c3168 = c3167Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c3168.f10656 / c3168.f10655));
                C3167 c3169 = c3167Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c3169.f10656 / c3169.f10655)));
            }
            try {
                return Double.toString(c2006M8707.m3915(this.f16925));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8715(C3380 c3380) throws Throwable {
        if (f16919) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c3380);
        }
        c3380.f11269 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f16903;
        c3380.m6146(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c3380.readInt();
                byte[] bArr2 = new byte[4];
                c3380.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f16921)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f16905)) {
                    return;
                }
                if (Arrays.equals(bArr2, f16917)) {
                    byte[] bArr3 = new byte[i];
                    c3380.readFully(bArr3);
                    int i3 = c3380.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f16933 = i2;
                        m8711(0, bArr3);
                        m8721();
                        m8722(new C3380(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c3380.m6146(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                C5028.m8448("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8716() {
        String strM8714 = m8714("DateTimeOriginal");
        HashMap[] mapArr = this.f16924;
        if (strM8714 != null && m8714("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM8714.concat("\u0000").getBytes(f16914);
            map.put("DateTime", new C2006(bytes, 2, bytes.length));
        }
        if (m8714("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C2006.m3912(0L, this.f16925));
        }
        if (m8714("ImageLength") == null) {
            mapArr[0].put("ImageLength", C2006.m3912(0L, this.f16925));
        }
        if (m8714("Orientation") == null) {
            mapArr[0].put("Orientation", C2006.m3912(0L, this.f16925));
        }
        if (m8714("LightSource") == null) {
            mapArr[1].put("LightSource", C2006.m3912(0L, this.f16925));
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m8717(C3438 c3438) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC5599.m9448(mediaMetadataRetriever, new C3187(c3438));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f16924;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C2006.m3910(Integer.parseInt(strExtractMetadata), this.f16925));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C2006.m3910(Integer.parseInt(strExtractMetadata2), this.f16925));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", C2006.m3910(i, this.f16925));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c3438.m6222(i3);
                    byte[] bArr = new byte[6];
                    c3438.readFully(bArr);
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f16916)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    c3438.readFully(bArr2);
                    this.f16933 = i5;
                    m8711(0, bArr2);
                }
                if (f16919) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m8718(C3380 c3380) throws Throwable {
        if (f16919) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c3380);
        }
        c3380.f11269 = ByteOrder.LITTLE_ENDIAN;
        c3380.m6146(f16915.length);
        int i = c3380.readInt() + 8;
        byte[] bArr = f16904;
        c3380.m6146(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c3380.readFully(bArr2);
                int i2 = c3380.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f16897, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    c3380.readFully(bArr3);
                    this.f16933 = i3;
                    m8711(0, bArr3);
                    m8722(new C3380(bArr3));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c3380.m6146(i2);
            } catch (EOFException unused) {
                C5028.m8448("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m8719(C3380 c3380, HashMap map) throws Throwable {
        C2006 c2006 = (C2006) map.get("JPEGInterchangeFormat");
        C2006 c2007 = (C2006) map.get("JPEGInterchangeFormatLength");
        if (c2006 == null || c2007 == null) {
            return;
        }
        int iM3913 = c2006.m3913(this.f16925);
        int iM3914 = c2007.m3913(this.f16925);
        if (this.f16927 == 7) {
            iM3913 += this.f16928;
        }
        if (iM3913 > 0 && iM3914 > 0 && this.f16929 == null) {
            c3380.m6146(iM3913);
            c3380.readFully(new byte[iM3914]);
        }
        if (f16919) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM3913 + ", length: " + iM3914);
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m8720(C3438 c3438) throws Throwable {
        m8729(c3438);
        m8708(c3438, 0);
        m8713(c3438, 0);
        m8713(c3438, 5);
        m8713(c3438, 4);
        m8721();
        if (this.f16927 == 8) {
            HashMap[] mapArr = this.f16924;
            C2006 c2006 = (C2006) mapArr[1].get("MakerNote");
            if (c2006 != null) {
                C3438 c3439 = new C3438(c2006.f6622);
                c3439.f11269 = this.f16925;
                c3439.m6146(6);
                m8708(c3439, 9);
                C2006 c2007 = (C2006) mapArr[9].get("ColorSpace");
                if (c2007 != null) {
                    mapArr[1].put("ColorSpace", c2007);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m8721() throws Throwable {
        m8727(0, 5);
        m8727(0, 4);
        m8727(5, 4);
        HashMap[] mapArr = this.f16924;
        C2006 c2006 = (C2006) mapArr[1].get("PixelXDimension");
        C2006 c2007 = (C2006) mapArr[1].get("PixelYDimension");
        if (c2006 != null && c2007 != null) {
            mapArr[0].put("ImageWidth", c2006);
            mapArr[0].put("ImageLength", c2007);
        }
        if (mapArr[4].isEmpty() && m8726(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m8726(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m8712(0, "ThumbnailOrientation", "Orientation");
        m8712(0, "ThumbnailImageLength", "ImageLength");
        m8712(0, "ThumbnailImageWidth", "ImageWidth");
        m8712(5, "ThumbnailOrientation", "Orientation");
        m8712(5, "ThumbnailImageLength", "ImageLength");
        m8712(5, "ThumbnailImageWidth", "ImageWidth");
        m8712(4, "Orientation", "ThumbnailOrientation");
        m8712(4, "ImageLength", "ThumbnailImageLength");
        m8712(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m8722(C3380 c3380) throws Throwable {
        C2006 c2006;
        int iM3913;
        HashMap map = this.f16924[4];
        C2006 c2007 = (C2006) map.get("Compression");
        if (c2007 == null) {
            m8719(c3380, map);
            return;
        }
        int iM3914 = c2007.m3913(this.f16925);
        if (iM3914 != 1) {
            if (iM3914 == 6) {
                m8719(c3380, map);
                return;
            } else if (iM3914 != 7) {
                return;
            }
        }
        C2006 c2008 = (C2006) map.get("BitsPerSample");
        if (c2008 != null) {
            int[] iArr = (int[]) c2008.m3916(this.f16925);
            int[] iArr2 = f16912;
            if (Arrays.equals(iArr2, iArr) || (this.f16927 == 3 && (c2006 = (C2006) map.get("PhotometricInterpretation")) != null && (((iM3913 = c2006.m3913(this.f16925)) == 1 && Arrays.equals(iArr, f16913)) || (iM3913 == 6 && Arrays.equals(iArr, iArr2))))) {
                C2006 c2009 = (C2006) map.get("StripOffsets");
                C2006 c20010 = (C2006) map.get("StripByteCounts");
                if (c2009 == null || c20010 == null) {
                    return;
                }
                long[] jArrM7937 = AbstractC4554.m7937(c2009.m3916(this.f16925));
                long[] jArrM7938 = AbstractC4554.m7937(c20010.m3916(this.f16925));
                if (jArrM7937 == null || jArrM7937.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM7938 == null || jArrM7938.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM7937.length != jArrM7938.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM7938) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f16926 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM7937.length; i3++) {
                    int i4 = (int) jArrM7937[i3];
                    int i5 = (int) jArrM7938[i3];
                    if (i3 < jArrM7937.length - 1 && i4 + i5 != jArrM7937[i3 + 1]) {
                        this.f16926 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c3380.m6146(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            c3380.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f16926) {
                    long j3 = jArrM7937[0];
                    return;
                }
                return;
            }
        }
        if (f16919) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8723(C3380 c3380) throws Throwable {
        boolean z = f16919;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c3380);
        }
        c3380.m6146(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c3380.readFully(bArr);
        c3380.readFully(bArr2);
        c3380.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c3380.m6146(i - c3380.f11271);
        c3380.readFully(bArr4);
        m8709(new C3380(bArr4), i, 5);
        c3380.m6146(i3 - c3380.f11271);
        c3380.f11269 = ByteOrder.BIG_ENDIAN;
        int i4 = c3380.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c3380.readUnsignedShort();
            int unsignedShort2 = c3380.readUnsignedShort();
            if (unsignedShort == f16918.f18248) {
                short s = c3380.readShort();
                short s2 = c3380.readShort();
                C2006 c2006M3910 = C2006.m3910(s, this.f16925);
                C2006 c2006M3911 = C2006.m3910(s2, this.f16925);
                HashMap[] mapArr = this.f16924;
                mapArr[0].put("ImageLength", c2006M3910);
                mapArr[0].put("ImageWidth", c2006M3911);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c3380.m6146(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m8724(C3438 c3438) throws Throwable {
        if (f16919) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c3438);
        }
        m8720(c3438);
        HashMap[] mapArr = this.f16924;
        C2006 c2006 = (C2006) mapArr[0].get("JpgFromRaw");
        if (c2006 != null) {
            m8709(new C3380(c2006.f6622), (int) c2006.f6619, 5);
        }
        C2006 c2007 = (C2006) mapArr[0].get("ISO");
        C2006 c2008 = (C2006) mapArr[1].get("PhotographicSensitivity");
        if (c2007 == null || c2008 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c2007);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m8725(C3438 c3438) throws Throwable {
        int i;
        int i2;
        m8720(c3438);
        HashMap[] mapArr = this.f16924;
        C2006 c2006 = (C2006) mapArr[1].get("MakerNote");
        if (c2006 != null) {
            C3438 c3439 = new C3438(c2006.f6622);
            c3439.f11269 = this.f16925;
            byte[] bArr = f16901;
            byte[] bArr2 = new byte[bArr.length];
            c3439.readFully(bArr2);
            c3439.m6222(0L);
            byte[] bArr3 = f16899;
            byte[] bArr4 = new byte[bArr3.length];
            c3439.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c3439.m6222(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c3439.m6222(12L);
            }
            m8708(c3439, 6);
            C2006 c2007 = (C2006) mapArr[7].get("PreviewImageStart");
            C2006 c2008 = (C2006) mapArr[7].get("PreviewImageLength");
            if (c2007 != null && c2008 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c2007);
                mapArr[5].put("JPEGInterchangeFormatLength", c2008);
            }
            C2006 c2009 = (C2006) mapArr[8].get("AspectFrame");
            if (c2009 != null) {
                int[] iArr = (int[]) c2009.m3916(this.f16925);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C2006 c2006M3910 = C2006.m3910(i5, this.f16925);
                C2006 c2006M3911 = C2006.m3910(i6, this.f16925);
                mapArr[0].put("ImageWidth", c2006M3910);
                mapArr[0].put("ImageLength", c2006M3911);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m8726(HashMap map) {
        C2006 c2006 = (C2006) map.get("ImageLength");
        C2006 c2007 = (C2006) map.get("ImageWidth");
        if (c2006 == null || c2007 == null) {
            return false;
        }
        return c2006.m3913(this.f16925) <= 512 && c2007.m3913(this.f16925) <= 512;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m8727(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f16924;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f16919;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C2006 c2006 = (C2006) mapArr[i].get("ImageLength");
        C2006 c2007 = (C2006) mapArr[i].get("ImageWidth");
        C2006 c2008 = (C2006) mapArr[i2].get("ImageLength");
        C2006 c2009 = (C2006) mapArr[i2].get("ImageWidth");
        if (c2006 == null || c2007 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c2008 == null || c2009 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM3913 = c2006.m3913(this.f16925);
        int iM3914 = c2007.m3913(this.f16925);
        int iM3915 = c2008.m3913(this.f16925);
        int iM3916 = c2009.m3913(this.f16925);
        if (iM3913 >= iM3915 || iM3914 >= iM3916) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m8728() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f16924;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM8680 = AbstractC5078.m8680(i, "The size of tag group[", "]: ");
            sbM8680.append(mapArr[i].size());
            Log.d("ExifInterface", sbM8680.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C2006 c2006 = (C2006) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c2006.toString() + ", tagValue: '" + c2006.m3914(this.f16925) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m8729(C3438 c3438) throws IOException {
        ByteOrder byteOrderM8706 = m8706(c3438);
        this.f16925 = byteOrderM8706;
        c3438.f11269 = byteOrderM8706;
        int unsignedShort = c3438.readUnsignedShort();
        int i = this.f16927;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            C5028.m8452(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = c3438.readInt();
        if (i2 < 8) {
            C5028.m8448(AbstractC5078.m8670(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c3438.m6146(i3);
        }
    }
}
