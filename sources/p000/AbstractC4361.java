package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ۦٗؔؒۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4361 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0914 f14365 = new C0914();

    /* JADX INFO: renamed from: ۥۗ */
    public static final Object f14364 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public static C3223 f14363 = null;

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX INFO: renamed from: ۥؗ */
    public static void m7665(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        C2176 c2176M4227;
        C2176 c2176;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f14363 == null) {
            synchronized (f14364) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        long jM7667 = m7667(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            c2176M4227 = C2176.m4227(file3);
                        } else {
                            c2176M4227 = null;
                        }
                        if (c2176M4227 == null) {
                            if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z) {
                            i = 2;
                        }
                        if (c2176M4227 != null) {
                            i = 3;
                        }
                        c2176 = new C2176(1, i, jM7667, length);
                        if (c2176M4227 != null) {
                            c2176.m4228(file3);
                        } else {
                            c2176.m4228(file3);
                        }
                        m7666();
                        return;
                    }
                    m7666();
                    return;
                }
                if (f14363 != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 28 && i2 != 30) {
                            file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                            long length3 = file.length();
                            if (file.exists() || length3 <= 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file2.length();
                            if (file2.exists() || length <= 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            try {
                                long jM7668 = m7667(context);
                                file3 = new File(context.getFilesDir(), "profileInstalled");
                                if (file3.exists()) {
                                    try {
                                        c2176M4227 = C2176.m4227(file3);
                                    } catch (IOException unused) {
                                        m7666();
                                        return;
                                    }
                                } else {
                                    c2176M4227 = null;
                                }
                                if (c2176M4227 == null && c2176M4227.f7179 == jM7668 && (i3 = c2176M4227.f7180) != 2) {
                                    i = i3;
                                } else if (!z2) {
                                    i = 327680;
                                } else if (z3) {
                                    i = 1;
                                } else if (z4) {
                                    i = 2;
                                }
                                if (z && z4 && i != 1) {
                                    i = 2;
                                }
                                if (c2176M4227 != null && c2176M4227.f7180 == 2 && i == 1 && length3 < c2176M4227.f7182) {
                                    i = 3;
                                }
                                c2176 = new C2176(1, i, jM7668, length);
                                if (c2176M4227 != null || !c2176M4227.equals(c2176)) {
                                    try {
                                        c2176.m4228(file3);
                                    } catch (IOException unused2) {
                                    }
                                }
                                m7666();
                                return;
                            } catch (PackageManager.NameNotFoundException unused3) {
                                m7666();
                                return;
                            }
                        }
                        m7666();
                        return;
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                    z2 = false;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C3223 m7666() {
        C3223 c3223 = new C3223(22);
        f14363 = c3223;
        f14365.m6602(c3223);
        return f14363;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static long m7667(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC2207.m4269(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
