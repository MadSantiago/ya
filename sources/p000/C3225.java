package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: ۦؙْؔؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3225 {

    /* JADX INFO: renamed from: ۥؗ */
    public static C3225 f10837;

    /* JADX INFO: renamed from: ۥۗ */
    public volatile Object f10838;

    /* JADX INFO: renamed from: ۥۣ */
    public Object f10839;

    /* JADX INFO: renamed from: ۥُ */
    public static AbstractBinderC4737 m5950(PackageInfo packageInfo, AbstractBinderC4737... abstractBinderC4737Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC4567 binderC4567 = new BinderC4567(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < abstractBinderC4737Arr.length; i++) {
                if (abstractBinderC4737Arr[i].equals(binderC4567)) {
                    return abstractBinderC4737Arr[i];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3225 m5951(Context context) {
        C3225 c3225;
        AbstractC0487.m1047(context);
        synchronized (C3225.class) {
            c3225 = f10837;
            if (c3225 == null) {
                BinderC4002 binderC4002 = AbstractC1473.f5013;
                synchronized (AbstractC1473.class) {
                    if (AbstractC1473.f5011 == null) {
                        AbstractC1473.f5011 = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c3225 = new C3225();
                c3225.f10839 = context.getApplicationContext();
                f10837 = c3225;
            }
        }
        return c3225;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean m5952(PackageInfo packageInfo, boolean z) {
        C5758 c5758;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                C5758 c5759 = z ? AbstractC3421.f11380 : AbstractC3421.f11381;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        C1903 c1903 = AbstractC1958.f6454;
                        Object[] objArr = {byteArray};
                        AbstractC4225.m7483(1, objArr);
                        c5758 = new C5758(1, objArr);
                    } else {
                        C1903 c1904 = AbstractC1958.f6454;
                        c5758 = C5758.f18975;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        C1903 c1905 = AbstractC1958.f6454;
                        c5758 = C5758.f18975;
                    } else {
                        C1903 c1906 = AbstractC1958.f6454;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        c5758 = i4 == 0 ? C5758.f18975 : new C5758(i4, objArrCopyOf);
                    }
                }
                if (c5758.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                AbstractC1958 abstractC1958Mo3841 = c5758.mo3841();
                int size = abstractC1958Mo3841.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) abstractC1958Mo3841.get(i6);
                    C1903 c1903M3840 = c5759.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!c1903M3840.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) c1903M3840.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? m5950(packageInfo, AbstractC3421.f11382) : m5950(packageInfo, AbstractC3421.f11382[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public C3001 m5953(final C0996 c0996) {
        final C0613 c0613 = (C0613) this.f10838;
        C0613 c0614 = C3001.f10093;
        if (c0613 != c0614) {
            C4601 c4601 = C3001.f10092;
            c4601.getClass();
            final C2942 c2942 = new C2942();
            c2942.f9879 = false;
            ConcurrentHashMap concurrentHashMap = c4601.f15183;
            Context context = c0996.f3561;
            String str = c0613.f2293;
            if (str == null) {
                str = (String) c0613.f2292.apply(context);
                c0613.f2293 = str;
            }
            C0417 c0417 = (C0417) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: ۥۧۧۦ
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    C0417 c0418 = new C0417(new C3001(c0996, c0613));
                    c2942.f9879 = true;
                    return c0418;
                }
            });
            if (c2942.f9879) {
                Context context2 = c0996.f3561;
                C3743 c3743 = new C3743(6, c4601);
                if (C5801.f19117 == null) {
                    synchronized (C5801.class) {
                        try {
                            if (C5801.f19117 == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new C5801(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new C5801(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                C5801.f19117 = c3743;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.f10839 = c0417.f1508;
            this.f10838 = c0614;
        }
        return (C3001) this.f10839;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01d1  */
    /* JADX INFO: renamed from: ۥۗ */
    public boolean m5954(int i) {
        C5470 c5470M9154;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.f10839).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            c5470M9154 = C5470.m9154("no pkgs");
        } else {
            c5470M9154 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    AbstractC0487.m1047(c5470M9154);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    c5470M9154 = C5470.m9154("null pkg");
                } else if (str.equals((String) this.f10838)) {
                    c5470M9154 = C5470.f18033;
                } else {
                    BinderC4002 binderC4002 = AbstractC1473.f5013;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            AbstractC1473.m3089();
                            boolean zM7279 = ((C4095) AbstractC1473.f5010).m7279();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zM7279) {
                                boolean zM4347 = AbstractC2292.m4347((Context) this.f10839);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    AbstractC0487.m1047(AbstractC1473.f5011);
                                    try {
                                        AbstractC1473.m3089();
                                        AbstractC0487.m1047(AbstractC1473.f5011);
                                        Context context = (Context) BinderC1409.m2976(BinderC1409.m2975(new BinderC1409(AbstractC1473.f5011)));
                                        try {
                                            C4095 c4095 = (C4095) AbstractC1473.f5010;
                                            Parcel parcelM7504 = c4095.m7504();
                                            int i3 = AbstractC3419.f11378;
                                            parcelM7504.writeInt(1);
                                            int iM7800 = AbstractC4489.m7800(parcelM7504, 20293);
                                            AbstractC4489.m7775(parcelM7504, 1, str);
                                            AbstractC4489.m7797(parcelM7504, 2, 4);
                                            parcelM7504.writeInt(zM4347 ? 1 : 0);
                                            AbstractC4489.m7797(parcelM7504, 3, 4);
                                            parcelM7504.writeInt(0);
                                            AbstractC4489.m7802(parcelM7504, 4, new BinderC1409(context));
                                            AbstractC4489.m7797(parcelM7504, 5, 4);
                                            parcelM7504.writeInt(0);
                                            AbstractC4489.m7797(parcelM7504, 6, 4);
                                            parcelM7504.writeInt(1);
                                            AbstractC4489.m7797(parcelM7504, 8, 4);
                                            parcelM7504.writeInt(0);
                                            AbstractC4489.m7790(parcelM7504, iM7800);
                                            Parcel parcelM7508 = c4095.m7508(parcelM7504, 6);
                                            C3434 c3434 = (C3434) AbstractC3419.m6199(parcelM7508, C3434.CREATOR);
                                            parcelM7508.recycle();
                                            if (c3434.f11404) {
                                                AbstractC3801.m6769(c3434.f11402);
                                                Object obj = null;
                                                c5470M9154 = new C5470(0, obj, obj, true);
                                            } else {
                                                String str2 = c3434.f11403;
                                                PackageManager.NameNotFoundException nameNotFoundException = AbstractC2765.m5124(c3434.f11401) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                AbstractC3801.m6769(c3434.f11402);
                                                AbstractC2765.m5124(c3434.f11401);
                                                c5470M9154 = new C5470(0, str2, nameNotFoundException, 0 == true ? 1 : 0);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            c5470M9154 = C5470.m9155("module call", e);
                                        }
                                    } catch (C2784 e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        c5470M9154 = C5470.m9155("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = ((Context) this.f10839).getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                    boolean zM4348 = AbstractC2292.m4347((Context) this.f10839);
                                    if (packageInfo == null) {
                                        c5470M9154 = C5470.m9154("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            c5470M9154 = C5470.m9154("single cert required");
                                        } else {
                                            BinderC4567 binderC4567 = new BinderC4567(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                C5470 c5470M3088 = AbstractC1473.m3088(str3, binderC4567, zM4348, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (c5470M3088.f18035 && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        C5470 c5470M3089 = AbstractC1473.m3088(str3, binderC4567, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (c5470M3089.f18035) {
                                                            c5470M9154 = C5470.m9154("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                                c5470M9154 = c5470M3088;
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                    if (c5470M9154.f18035) {
                                        this.f10838 = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    c5470M9154 = C5470.m9155("no pkg ".concat(str), e3);
                                }
                            }
                        } catch (RemoteException | C2784 e4) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (c5470M9154.f18035) {
                            this.f10838 = str;
                        }
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th4;
                    }
                }
                if (c5470M9154.f18035) {
                    break;
                }
                i2++;
            }
        }
        if (!c5470M9154.f18035 && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = (Throwable) c5470M9154.f18037;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", c5470M9154.mo2648(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", c5470M9154.mo2648());
            }
        }
        return c5470M9154.f18035;
    }
}
