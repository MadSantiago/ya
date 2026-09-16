package p000;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦٍؑۥٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3761 implements InterfaceC1636 {

    /* JADX INFO: renamed from: ۦۨ */
    public static final /* synthetic */ int[] f12522 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49};

    /* JADX INFO: renamed from: ۥؗ */
    public static /* synthetic */ int m6617(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static void m6618(int i, C5362 c5362, int i2, C3136 c3136) {
        c5362.m8987(Integer.valueOf(i));
        c5362.m8974(c3136, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static /* synthetic */ boolean m6619(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static /* synthetic */ boolean m6620(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static String m6621(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static String m6622(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥٖ */
    public static /* synthetic */ void m6623(InterfaceC0252 interfaceC0252) throws Exception {
        boolean zIsTerminated;
        if (interfaceC0252 instanceof AutoCloseable) {
            interfaceC0252.close();
            return;
        }
        if (!(interfaceC0252 instanceof ExecutorService)) {
            if (interfaceC0252 instanceof TypedArray) {
                ((TypedArray) interfaceC0252).recycle();
                return;
            }
            if (interfaceC0252 instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) interfaceC0252).release();
                return;
            } else if (interfaceC0252 instanceof MediaDrm) {
                ((MediaDrm) interfaceC0252).release();
                return;
            } else {
                C0178.m393();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) interfaceC0252;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static /* synthetic */ String m6624(int i) {
        if (i == 1) {
            return "ZYGOTE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "RESOURCES";
        }
        return "PACKAGE";
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static /* synthetic */ boolean m6625(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static int m6626(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static /* synthetic */ int m6627(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static String m6628(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static String m6629(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static String m6630(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static /* synthetic */ int[] m6631(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f12522, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static /* synthetic */ int m6632(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static C1228 m6633(String str) {
        AbstractC3480.m6277(str);
        return new C1228(5);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static String m6634(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static int m6635(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static String m6636(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static /* synthetic */ String m6637(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static String m6638(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static String m6639(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }
}
