package p000;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۦۦٍُؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5781 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ServiceConnectionC2110 f19049 = new ServiceConnectionC2110(2);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2337 f19048 = new C2337();

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0300 f19047 = new C0300();

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2432 f19050 = new C2432(new C2971(8));

    /* JADX INFO: renamed from: ۥؗ */
    public static void m9596() {
        if (AbstractC3310.m6080()) {
            try {
                if (AbstractC3310.m6079() == 0) {
                    AbstractC3310.m6083((C3268) f19050.getValue());
                }
            } catch (Throwable th) {
                MainActivity mainActivity = MainActivity.f411;
                C3998.m7138(AbstractC5537.m9252(), R.string.dialog_shizuku_message, th.toString(), 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m9597() {
        App app = App.f407;
        C1443 c1443 = AbstractC2776.m5217().f410;
        C1542 c1542 = AbstractC2539.f8442;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (((String) c1443.m3068(obj, str)).equals(new C4441(new long[]{-4749896404075246423L, -6426183638563899857L}).toString()) || ((InterfaceC1897) f19049.f6933) != null) {
            return;
        }
        c1443.m3071(new C4215(18));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m9598() {
        EnumC5503 enumC5503;
        boolean z = true;
        if (!AbstractC3310.m6080()) {
            enumC5503 = EnumC5503.f18164;
        } else if (AbstractC3310.m6079() == 0) {
            enumC5503 = EnumC5503.f18167;
        } else {
            try {
                try {
                    ((C5595) AbstractC3310.m6081()).m9436();
                    enumC5503 = EnumC5503.f18166;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e2) {
                MainActivity mainActivity = MainActivity.f411;
                C3998.m7138(AbstractC5537.m9252(), R.string.dialog_shizuku_message, e2.toString(), 1);
                enumC5503 = EnumC5503.f18164;
            }
        }
        int iOrdinal = enumC5503.ordinal();
        int i = 2;
        if (iOrdinal == 0) {
            try {
                C3268 c3268 = (C3268) f19050.getValue();
                ServiceConnectionC2110 serviceConnectionC2110 = f19049;
                Map map = AbstractC2605.f8697;
                String className = c3268.f10983;
                if (className == null) {
                    className = c3268.f10982.getClassName();
                }
                Map map2 = AbstractC2605.f8697;
                BinderC0972 binderC0972 = (BinderC0972) map2.get(className);
                if (binderC0972 == null) {
                    binderC0972 = new BinderC0972(c3268);
                    map2.put(className, binderC0972);
                }
                binderC0972.f3434.add(serviceConnectionC2110);
                try {
                    ((C5595) AbstractC3310.m6081()).m9438(binderC0972, c3268.m6035());
                    C0649 c0649 = AbstractC0912.f3276;
                    AbstractC2765.m5135(AbstractC4009.m7151(AbstractC5794.f19088), null, 0, new C4564(i, null, 5), 3);
                    return;
                } catch (RemoteException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Throwable th) {
                MainActivity mainActivity2 = MainActivity.f411;
                C3998.m7138(AbstractC5537.m9252(), R.string.dialog_shizuku_message, th.toString(), 1);
                return;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                m9597();
                return;
            } else {
                C1078.m2275();
                return;
            }
        }
        if (AbstractC3310.f11079) {
            z = false;
        } else if (!AbstractC3310.f11074) {
            try {
                C5595 c5595 = (C5595) AbstractC3310.m6081();
                c5595.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    c5595.f18438.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    AbstractC3310.f11074 = z;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            } catch (RemoteException e4) {
                C5028.m8450(e4);
                return;
            }
        }
        if (z) {
            return;
        }
        AbstractC4489.m7804(R.string.toast_shizuku_request);
    }
}
