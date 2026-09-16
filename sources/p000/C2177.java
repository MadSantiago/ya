package p000;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥُۘؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2177 implements InterfaceC5854 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f7183;

    /* JADX INFO: renamed from: ۥَ */
    public int f7184;

    /* JADX INFO: renamed from: ۥُ */
    public int f7185;

    /* JADX INFO: renamed from: ۥّ */
    public int f7186;

    /* JADX INFO: renamed from: ۥْ */
    public final C2790 f7187;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f7188;

    /* JADX INFO: renamed from: ۥۗ */
    public int f7189;

    /* JADX INFO: renamed from: ۥۜ */
    public String f7190;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f7191;

    /* JADX INFO: renamed from: ۦؑ */
    public int f7192;

    /* JADX INFO: renamed from: ۦؚ */
    public CharSequence f7193;

    /* JADX INFO: renamed from: ۦٌ */
    public ArrayList f7194;

    /* JADX INFO: renamed from: ۦِ */
    public CharSequence f7195;

    /* JADX INFO: renamed from: ۦٛ */
    public int f7196;

    /* JADX INFO: renamed from: ۦۗ */
    public int f7197;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f7198;

    /* JADX INFO: renamed from: ۦۚ */
    public ArrayList f7199;

    /* JADX INFO: renamed from: ۦ۟ */
    public ArrayList f7200;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f7201;

    public C2177(C2790 c2790) {
        c2790.m5299();
        C0827 c0827 = c2790.f9309;
        if (c0827 != null) {
            c0827.f2924.getClassLoader();
        }
        this.f7191 = new ArrayList();
        this.f7201 = false;
        this.f7184 = -1;
        this.f7187 = c2790;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7184 >= 0) {
            sb.append(" #");
            sb.append(this.f7184);
        }
        if (this.f7190 != null) {
            sb.append(" ");
            sb.append(this.f7190);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4229(int i) {
        if (this.f7198) {
            if (C2790.m5261(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f7191;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4088 c4088 = (C4088) arrayList.get(i2);
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c4088.f13652;
                if (abstractComponentCallbacksC0308 != null) {
                    abstractComponentCallbacksC0308.f1143 += i;
                    if (C2790.m5261(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c4088.f13652 + " to " + c4088.f13652.f1143);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m4230(boolean z, boolean z2) {
        if (this.f7188) {
            C1078.m2276("commit already called");
            return 0;
        }
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C2814());
            m4234("  ", printWriter, true);
            printWriter.close();
        }
        this.f7188 = true;
        boolean z3 = this.f7198;
        C2790 c2790 = this.f7187;
        if (z3) {
            this.f7184 = c2790.f9329.getAndIncrement();
        } else {
            this.f7184 = -1;
        }
        if (z2) {
            c2790.m5279(this, z);
        }
        return this.f7184;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m4231(int i, AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, String str) {
        String str2 = abstractComponentCallbacksC0308.f1135;
        if (str2 != null) {
            AbstractC3787.m6702(abstractComponentCallbacksC0308, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0308.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0308.f1150;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC0308);
                sb.append(": was ");
                C1078.m2276(AbstractC3761.m6622(sb, abstractComponentCallbacksC0308.f1150, " now ", str));
                return;
            }
            abstractComponentCallbacksC0308.f1150 = str;
        }
        if (i != 0) {
            if (i == -1) {
                C1078.m2280("Can't add fragment ", abstractComponentCallbacksC0308, " with tag ", str, " to container view with no id");
                return;
            }
            int i2 = abstractComponentCallbacksC0308.f1146;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(abstractComponentCallbacksC0308);
                int i3 = abstractComponentCallbacksC0308.f1146;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            abstractComponentCallbacksC0308.f1146 = i;
            abstractComponentCallbacksC0308.f1113 = i;
        }
        m4232(new C4088(1, abstractComponentCallbacksC0308));
        abstractComponentCallbacksC0308.f1141 = this.f7187;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4232(C4088 c4088) {
        this.f7191.add(c4088);
        c4088.f13655 = this.f7189;
        c4088.f13650 = this.f7183;
        c4088.f13651 = this.f7192;
        c4088.f13657 = this.f7185;
    }

    @Override // p000.InterfaceC5854
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo544(ArrayList arrayList, ArrayList arrayList2) {
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7198) {
            return true;
        }
        this.f7187.f9316.add(this);
        return true;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4233() {
        ArrayList arrayList = this.f7191;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C4088 c4088 = (C4088) arrayList.get(size);
            if (c4088.f13649) {
                if (c4088.f13654 == 8) {
                    c4088.f13649 = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = c4088.f13652.f1113;
                    c4088.f13654 = 2;
                    c4088.f13649 = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        C4088 c4089 = (C4088) arrayList.get(i2);
                        if (c4089.f13649 && c4089.f13652.f1113 == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m4234(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f7190);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7184);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7188);
            if (this.f7186 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7186));
            }
            if (this.f7189 != 0 || this.f7183 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7189));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7183));
            }
            if (this.f7192 != 0 || this.f7185 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7192));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7185));
            }
            if (this.f7196 != 0 || this.f7195 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7196));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7195);
            }
            if (this.f7197 != 0 || this.f7193 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7197));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7193);
            }
        }
        ArrayList arrayList = this.f7191;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4088 c4088 = (C4088) arrayList.get(i);
            switch (c4088.f13654) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    str2 = "REPLACE";
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c4088.f13654;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c4088.f13652);
            if (z) {
                if (c4088.f13655 != 0 || c4088.f13650 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c4088.f13655));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c4088.f13650));
                }
                if (c4088.f13651 != 0 || c4088.f13657 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c4088.f13651));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c4088.f13657));
                }
            }
        }
    }
}
