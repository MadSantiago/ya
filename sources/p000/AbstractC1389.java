package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٕؒۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1389 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4645 f4744;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4645 f4745;

    /* JADX INFO: renamed from: ۥۣ */
    public static final AbstractC4821 f4746;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4645 f4747;

    static {
        int i = AbstractC4821.f15885;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f4746 = AbstractC4821.m8196(15, objArr);
        C1868 c1868 = AbstractC4822.f15887;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC3831.m6883(7, objArr2);
        f4745 = AbstractC4822.m8197(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        AbstractC3831.m6883(3, objArr3);
        f4744 = AbstractC4822.m8197(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        AbstractC3831.m6883(2, objArr4);
        f4747 = AbstractC4822.m8197(2, objArr4);
        AbstractC3933.m7099(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String[] strArr = AbstractC1434.f4918;
        AbstractC3831.m6883(15, strArr);
        int i2 = 0 + 15;
        if (objArrCopyOf.length < i2) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C3094.m5680(objArrCopyOf.length, i2));
        }
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        int i3 = 0 + 15;
        String[] strArr2 = AbstractC1434.f4915;
        AbstractC3831.m6883(15, strArr2);
        int i4 = i3 + 15;
        if (objArrCopyOf.length < i4) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C3094.m5680(objArrCopyOf.length, i4));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, i3, 15);
        AbstractC4822.m8197(i3 + 15, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        AbstractC3831.m6883(2, objArr5);
        AbstractC4822.m8197(2, objArr5);
    }
}
