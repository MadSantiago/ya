package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦؔۖٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3247 extends AbstractC1434 {

    /* JADX INFO: renamed from: ۥْ */
    public static boolean f10898 = false;

    /* JADX INFO: renamed from: ۦٌ */
    public static Class f10899;

    /* JADX INFO: renamed from: ۦۚ */
    public static Constructor f10900;

    /* JADX INFO: renamed from: ۦ۟ */
    public static Method f10901;

    /* JADX INFO: renamed from: ۦۨ */
    public static Method f10902;

    /* JADX INFO: renamed from: ۥّ */
    public final Class f10903;

    /* JADX INFO: renamed from: ۥۜ */
    public final Method f10904;

    /* JADX INFO: renamed from: ۦؚ */
    public final Method f10905;

    /* JADX INFO: renamed from: ۦِ */
    public final Method f10906;

    /* JADX INFO: renamed from: ۦٛ */
    public final Method f10907;

    /* JADX INFO: renamed from: ۦۗ */
    public final Method f10908;

    /* JADX INFO: renamed from: ۦۙ */
    public final Constructor f10909;

    public C3247() throws NoSuchMethodException {
        Method methodMo3742;
        Constructor<?> constructor;
        Method methodM5961;
        Method method;
        Method method2;
        Method method3;
        super(24);
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM5961 = m5961(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo3742 = mo3742(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo3742 = null;
            constructor = null;
            methodM5961 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f10903 = cls;
        this.f10909 = constructor;
        this.f10904 = methodM5961;
        this.f10907 = method;
        this.f10906 = method2;
        this.f10908 = method3;
        this.f10905 = methodMo3742;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static Method m5961(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m5962() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f10898) {
            return;
        }
        f10898 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f10900 = constructor;
        f10899 = cls;
        f10902 = method2;
        f10901 = method;
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static boolean m5963(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m5962();
        try {
            return ((Boolean) f10902.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            C5028.m8450(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public Method mo3742(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final boolean m5964(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10904.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final boolean m5965(Object obj) {
        try {
            return ((Boolean) this.f10906.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public Typeface mo3743(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f10903, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10905.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦؚ */
    public final Typeface mo2706(Context context, C5056[] c5056Arr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo3743;
        boolean zBooleanValue;
        MappedByteBuffer map;
        if (c5056Arr.length >= 1) {
            Method method = this.f10904;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map2 = new HashMap();
                    for (C5056 c5056 : c5056Arr) {
                        if (c5056.f16788 == 0) {
                            Uri uri = c5056.f16790;
                            if (map2.containsKey(uri)) {
                                continue;
                            } else {
                                try {
                                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
                                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        }
                                        map = null;
                                    } else {
                                        try {
                                            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                            try {
                                                FileChannel channel = fileInputStream.getChannel();
                                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                                fileInputStream.close();
                                                parcelFileDescriptorOpenFileDescriptor.close();
                                            } catch (Throwable th) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                parcelFileDescriptorOpenFileDescriptor.close();
                                                throw th3;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (IOException unused) {
                                }
                                map2.put(uri, map);
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map2);
                    try {
                        objNewInstance = this.f10909.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c5056Arr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f10908;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!m5965(objNewInstance) || (typefaceMo3743 = mo3743(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceMo3743, i);
                            }
                            C5056 c5057 = c5056Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c5057.f16790);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f10907.invoke(objNewInstance, byteBuffer, Integer.valueOf(c5057.f16789), null, Integer.valueOf(c5057.f16786), Integer.valueOf(c5057.f16791 ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    C5056 c5058 = null;
                    for (C5056 c5059 : c5056Arr) {
                        int iAbs = (Math.abs(c5059.f16786 - i3) * 2) + (c5059.f16791 == z2 ? 0 : 1);
                        if (c5058 == null || i4 > iAbs) {
                            c5058 = c5059;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = context.getContentResolver().openFileDescriptor(c5058.f16790, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor()).setWeight(c5058.f16786).setItalic(c5058.f16791).build();
                            parcelFileDescriptorOpenFileDescriptor2.close();
                            return typefaceBuild;
                        } catch (Throwable th5) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor2.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                        parcelFileDescriptorOpenFileDescriptor2.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦۗ */
    public final Typeface mo2708(Context context, C2293 c2293, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        C0920[] c0920Arr = c2293.f7620;
        Method method = this.f10904;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            m5962();
            try {
                Object objNewInstance2 = f10900.newInstance(null);
                for (C0920 c0920 : c0920Arr) {
                    File fileM7059 = AbstractC3925.m7059(context);
                    if (fileM7059 != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(c0920.f3298);
                                try {
                                    boolean zM7058 = AbstractC3925.m7058(fileM7059, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zM7058) {
                                        fileM7059.delete();
                                        return null;
                                    }
                                    if (!m5963(objNewInstance2, fileM7059.getPath(), c0920.f3299, c0920.f3296)) {
                                        fileM7059.delete();
                                        return null;
                                    }
                                    fileM7059.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileM7059.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileM7059.delete();
                            throw th4;
                        }
                    }
                }
                m5962();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) f10899, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f10901.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    C5028.m8450(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                C5028.m8450(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.f10909.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = c0920Arr.length;
            while (i2 < length) {
                C0920 c0921 = c0920Arr[i2];
                C3247 c3247 = this;
                Context context2 = context;
                if (c3247.m5964(context2, objNewInstance, c0921.f3300, c0921.f3297, c0921.f3299, c0921.f3296 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0921.f3301))) {
                    i2++;
                    this = c3247;
                    context = context2;
                } else {
                    try {
                        c3247.f10908.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                    }
                }
            }
            C3247 c3248 = this;
            if (c3248.m5965(objNewInstance)) {
                return c3248.mo3743(objNewInstance);
            }
        }
        return null;
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦۚ */
    public final Typeface mo2709(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.f10904;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f10909.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m5964(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f10908.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m5965(objNewInstance)) {
                    return mo3743(objNewInstance);
                }
            }
        } else {
            File fileM7059 = AbstractC3925.m7059(context);
            try {
                if (fileM7059 != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zM7058 = AbstractC3925.m7058(fileM7059, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zM7058) {
                                fileM7059.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM7059.getPath());
                            fileM7059.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                return null;
            } finally {
                fileM7059.delete();
            }
        }
        return null;
    }
}
