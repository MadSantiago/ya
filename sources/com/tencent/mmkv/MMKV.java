package com.tencent.mmkv;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.AbstractC3761;
import p000.C1078;
import p000.C4441;
import p000.C5028;
import p000.EnumC0566;
import p000.EnumC2525;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: ۥؗ */
    public static final EnumC0566[] f359;

    /* JADX INFO: renamed from: ۥُ */
    public static String f360;

    /* JADX INFO: renamed from: ۥّ */
    public static boolean f361;

    /* JADX INFO: renamed from: ۥۗ */
    public static final EnumMap f362;

    /* JADX INFO: renamed from: ۥۣ */
    public static final EnumMap f363;

    /* JADX INFO: renamed from: ۦؑ */
    public static final HashSet f364;
    private final long nativeHandle;

    static {
        EnumMap enumMap = new EnumMap(EnumC2525.class);
        f363 = enumMap;
        enumMap.put(EnumC2525.f8363, 0);
        enumMap.put(EnumC2525.f8362, 1);
        EnumMap enumMap2 = new EnumMap(EnumC0566.class);
        f362 = enumMap2;
        EnumC0566 enumC0566 = EnumC0566.f2039;
        enumMap2.put(enumC0566, 0);
        EnumC0566 enumC0567 = EnumC0566.f2038;
        enumMap2.put(enumC0567, 1);
        EnumC0566 enumC0568 = EnumC0566.f2035;
        enumMap2.put(enumC0568, 2);
        EnumC0566 enumC0569 = EnumC0566.f2036;
        enumMap2.put(enumC0569, 3);
        EnumC0566 enumC05610 = EnumC0566.f2034;
        enumMap2.put(enumC05610, 4);
        f359 = new EnumC0566[]{enumC0566, enumC0567, enumC0568, enumC0569, enumC05610};
        f364 = new HashSet();
        f360 = null;
        f361 = true;
        new HashMap();
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d);

    private native float decodeFloat(long j, String str, float f);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBool_2(long j, String str, boolean z, int i);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, byte[] bArr, int i);

    private native boolean encodeDouble(long j, String str, double d);

    private native boolean encodeDouble_2(long j, String str, double d, int i);

    private native boolean encodeFloat(long j, String str, float f);

    private native boolean encodeFloat_2(long j, String str, float f, int i);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeInt_2(long j, String str, int i, int i2);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeLong_2(long j, String str, long j2, int i);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeSet_2(long j, String str, String[] strArr, int i);

    private native boolean encodeString(long j, String str, String str2);

    private native boolean encodeString_2(long j, String str, String str2, int i);

    private static native long getDefaultMMKV(int i, String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, String str2);

    private static native long getMMKVWithID(String str, int i, String str2, String str3, long j);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, String str2);

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i, boolean z);

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        int iOrdinal = f359[i].ordinal();
        if (iOrdinal == 0) {
            Log.d("MMKV", str3);
            return;
        }
        if (iOrdinal == 1) {
            Log.i("MMKV", str3);
        } else if (iOrdinal == 2) {
            Log.w("MMKV", str3);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            Log.e("MMKV", str3);
        }
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        StringBuilder sb = new StringBuilder("Recover strategic for ");
        sb.append(str);
        sb.append(" is ");
        EnumC2525 enumC2525 = EnumC2525.f8363;
        sb.append(enumC2525);
        m147(sb.toString());
        Integer num = (Integer) f363.get(enumC2525);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        StringBuilder sb = new StringBuilder("Recover strategic for ");
        sb.append(str);
        sb.append(" is ");
        EnumC2525 enumC2525 = EnumC2525.f8363;
        sb.append(enumC2525);
        m147(sb.toString());
        Integer num = (Integer) f363.get(enumC2525);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i);

    /* JADX INFO: renamed from: ۥۗ */
    public static MMKV m145(long j, String str) {
        if (j == 0) {
            throw new RuntimeException(AbstractC3761.m6629("Fail to create an MMKV instance [", str, "] in JNI"));
        }
        if (!f361) {
            return new MMKV(j);
        }
        HashSet hashSet = f364;
        synchronized (hashSet) {
            try {
                if (!hashSet.contains(Long.valueOf(j))) {
                    if (!checkProcessMode(j)) {
                        throw new IllegalArgumentException("Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!");
                    }
                    hashSet.add(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(j);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m146(Application application, String str, C5028 c5028) {
        if ((application.getApplicationInfo().flags & 2) == 0) {
            synchronized (f364) {
                f361 = false;
            }
            Log.i("MMKV", "Disable checkProcessMode()");
        } else {
            synchronized (f364) {
                f361 = true;
            }
            Log.i("MMKV", "Enable checkProcessMode()");
        }
        String absolutePath = application.getCacheDir().getAbsolutePath();
        System.loadLibrary(new C4441(new long[]{-5858003740460278549L, -7686273289116228563L, 3793205882974347665L}).toString());
        jniInitialize(str, absolutePath, 1, false);
        f360 = str;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m147(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = (Integer) f362.get(EnumC0566.f2038);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static MMKV m148(String str, String str2) {
        if (f360 != null) {
            return m145(getMMKVWithID(str, 1, str2, null, 0L), str);
        }
        C1078.m2276("You should Call MMKV.initialize() first.");
        return null;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static MMKV m149(String str) {
        if (f360 != null) {
            return m145(getMMKVWithID(str, 1, null, null, 0L), str);
        }
        C1078.m2276("You should Call MMKV.initialize() first.");
        return null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public native boolean enableAutoKeyExpire(int i);

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(strArrDecodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        encodeFloat(this.nativeHandle, str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
        return this;
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        m155(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m150(String str) {
        return containsKey(this.nativeHandle, str);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final String m151(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m152(long j, String str) {
        encodeLong(this.nativeHandle, str, j);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String[] m153() {
        return allKeys(this.nativeHandle, false);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final long m154(String str) {
        return decodeLong(this.nativeHandle, str, 0L);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m155(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m156(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    private static void onContentChangedByOuterProcess(String str) {
    }
}
