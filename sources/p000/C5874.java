package p000;

import android.app.Application;
import de.robv.android.xposed.XposedBridge;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦۨؓۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5874 extends AbstractC1246 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f19403;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5874(int i, int i2) {
        super(i);
        this.f19403 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01c5  */
    @Override // p000.AbstractC1246
    /* JADX INFO: renamed from: ۥّ */
    public final Object mo2634(C1414 c1414) {
        Object c4535;
        boolean zBooleanValue;
        Object c4536;
        String str;
        String string;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        Object c4537;
        Object c4538;
        Object c4539;
        int iIntValue = -1;
        Object c45310 = "unknown";
        boolean zBooleanValue2 = false;
        switch (this.f19403) {
            case 0:
                int i = AbstractC2776.f9251[0];
                if (AbstractC1630.f5457[AbstractC3761.m6632(i)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c4535 = Boolean.TRUE;
                    } catch (Throwable th) {
                        c4535 = new C4535(th);
                    }
                    if (c4535 instanceof C4535) {
                        c4535 = null;
                    }
                    Boolean bool = (Boolean) c4535;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    break;
                } else {
                    zBooleanValue = false;
                }
                int iM6632 = AbstractC3761.m6632(zBooleanValue ? i : 2);
                if (iM6632 == 0) {
                    iIntValue = 0;
                } else if (iM6632 != 1) {
                    C1078.m2275();
                    return null;
                }
                return Integer.valueOf(iIntValue);
            case 1:
                return Boolean.TRUE;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.TRUE;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                int i2 = AbstractC2776.f9251[0];
                if (AbstractC1630.f5457[AbstractC3761.m6632(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c4536 = Boolean.TRUE;
                    } catch (Throwable th2) {
                        c4536 = new C4535(th2);
                    }
                    if (c4536 instanceof C4535) {
                        c4536 = null;
                    }
                    Boolean bool2 = (Boolean) c4536;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    break;
                }
                int iM6633 = AbstractC3761.m6632(zBooleanValue2 ? i2 : 2);
                if (iM6633 == 0) {
                    C1967.f6501.getClass();
                    Application applicationM3850 = C1967.m3850();
                    if (applicationM3850 == null || (classLoader2 = applicationM3850.getClassLoader()) == null || !AbstractC2405.m4528(classLoader2, "me.weishu.exposed.ExposedBridge")) {
                        Application applicationM3851 = C1967.m3850();
                        if (applicationM3851 == null || (classLoader = applicationM3851.getClassLoader()) == null || !AbstractC2405.m4528(classLoader, "com.bug.load.BugLoad")) {
                            try {
                                C4229 c4229 = new C4229(AbstractC5041.m8557(XposedBridge.class).f10543, null, 1);
                                c4229.f14028 = 3;
                                C2749 c2749 = new C2749();
                                c2749.f9028 = c4229;
                                c2749.f9027 = "TAG";
                                c2749.f9024.addAll(Arrays.asList((EnumC1801[]) Arrays.copyOf(new EnumC1801[]{EnumC1801.f6000}, 1)));
                                C1865 c1865 = (C1865) AbstractC0973.m2058(c2749.m5108());
                                if (c1865 != null && (str = (String) c1865.m3715()) != null) {
                                    if (AbstractC0684.m1534(str)) {
                                        str = null;
                                    }
                                    if (str != null && (string = AbstractC0684.m9760(AbstractC4981.m8362(AbstractC4981.m8362(str, "Bridge", ""), "-", "")).toString()) != null) {
                                        c45310 = string;
                                    }
                                }
                            } catch (Throwable th3) {
                                c45310 = new C4535(th3);
                            }
                            String str2 = (String) (c45310 instanceof C4535 ? null : c45310);
                            c45310 = str2 == null ? "invalid" : str2;
                        } else {
                            c45310 = "BugXposed";
                        }
                    } else {
                        c45310 = "TaiChi";
                    }
                } else if (iM6633 != 1) {
                    C1078.m2275();
                    return null;
                }
                return c45310;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                int i3 = AbstractC2776.f9251[0];
                if (AbstractC1630.f5457[AbstractC3761.m6632(i3)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c4537 = Boolean.TRUE;
                    } catch (Throwable th4) {
                        c4537 = new C4535(th4);
                    }
                    if (c4537 instanceof C4535) {
                        c4537 = null;
                    }
                    Boolean bool3 = (Boolean) c4537;
                    if (bool3 != null) {
                        zBooleanValue2 = bool3.booleanValue();
                    }
                    break;
                }
                int iM6634 = AbstractC3761.m6632(zBooleanValue2 ? i3 : 2);
                if (iM6634 == 0) {
                    try {
                        c4538 = Integer.valueOf(XposedBridge.getXposedVersion());
                    } catch (Throwable th5) {
                        c4538 = new C4535(th5);
                    }
                    Integer num = (Integer) (c4538 instanceof C4535 ? null : c4538);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    break;
                } else if (iM6634 != 1) {
                    C1078.m2275();
                    return null;
                }
                return Integer.valueOf(iIntValue);
            default:
                int i4 = AbstractC2776.f9251[0];
                if (AbstractC1630.f5457[AbstractC3761.m6632(i4)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c4539 = Boolean.TRUE;
                    } catch (Throwable th6) {
                        c4539 = new C4535(th6);
                    }
                    if (c4539 instanceof C4535) {
                        c4539 = null;
                    }
                    Boolean bool4 = (Boolean) c4539;
                    if (bool4 != null) {
                        zBooleanValue2 = bool4.booleanValue();
                    }
                    break;
                }
                int iM6635 = AbstractC3761.m6632(zBooleanValue2 ? i4 : 2);
                if (iM6635 == 0) {
                    c45310 = "unsupported";
                } else if (iM6635 != 1) {
                    C1078.m2275();
                    return null;
                }
                return c45310;
        }
    }
}
