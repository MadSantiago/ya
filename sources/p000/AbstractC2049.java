package p000;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۥٟۖؒۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2049 {
    /* JADX INFO: renamed from: ۥؗ */
    public static /* synthetic */ int m3993(int i) {
        switch (i) {
            case 1:
                return 0;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return 1;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return 2;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return 3;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return 4;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return 5;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m3994(int i, int i2, int i3, int i4) {
        return AbstractC0438.m935(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static ClassCastException m3995(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m3996(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static /* synthetic */ void m3997(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                C0178.m393();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    /* JADX INFO: renamed from: ۥۣ */
    public static /* synthetic */ int m3998(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static int m3999(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static int m4000(int i, int i2, int i3) {
        return AbstractC0438.m935(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static /* synthetic */ void m4001(Object obj) {
        if (obj == null) {
            return;
        }
        C0178.m382();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static /* synthetic */ String m4002(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return "ANDROID_TOO_OLD";
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return "NON_PLAY_MODE";
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SDK_TOO_OLD";
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static InterfaceC5083 m4003(InterfaceC5083 interfaceC5083) {
        int size = interfaceC5083.size();
        return interfaceC5083.mo4971(size + size);
    }
}
