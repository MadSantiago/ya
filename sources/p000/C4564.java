package p000;

import android.content.Intent;
import android.os.RemoteException;
import java.util.ArrayList;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۦُٚؕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4564 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f15071;

    /* JADX INFO: renamed from: ۥٖ */
    public int f15072;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4564(int i, InterfaceC0443 interfaceC0443, int i2) {
        super(i, interfaceC0443);
        this.f15071 = i2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = 2;
        switch (this.f15071) {
            case 0:
                C4564 c4564 = new C4564(i, interfaceC0443, 0);
                c4564.f15072 = ((Number) obj).intValue();
                return c4564;
            case 1:
                return new C4564(i, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4564(i, interfaceC0443, i);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C4564(i, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C4564(i, interfaceC0443, 4);
            default:
                return new C4564(i, interfaceC0443, 5);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        switch (this.f15071) {
            case 0:
                int i = this.f15072;
                AbstractC0186.m409(obj);
                return Boolean.valueOf(i > 0);
            case 1:
                EnumC2282 enumC2282 = EnumC2282.f7590;
                int i2 = this.f15072;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    ServiceConnectionC2110 serviceConnectionC2110 = C5063.f16800;
                    if (((C5259) serviceConnectionC2110.f6933) != null) {
                        try {
                            AbstractC0282.m597(serviceConnectionC2110);
                        } catch (Throwable th) {
                            MainActivity mainActivity = MainActivity.f411;
                            C3998.m7138(AbstractC5537.m9252(), R.string.dialog_root_message, th.toString(), 1);
                        }
                    }
                    AbstractC5781.m9596();
                    C4036 c4036 = C5805.f19128;
                    long jM7166 = AbstractC4009.m7166(1000, EnumC3021.MILLISECONDS);
                    this.f15072 = 1;
                    if (AbstractC2765.m5133(jM7166, this) == enumC2282) {
                        return enumC2282;
                    }
                    break;
                } else {
                    if (i2 != 1) {
                        C0178.m389(new C4441(new long[]{-6208183045613904241L, -8665476410974371981L, -8692722786174093729L, -4355373700127246141L, 4989112371461244359L, 6789273886241629061L, -6438850558130000661L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f410;
                C1542 c1542 = AbstractC2539.f8442;
                Object obj2 = c1542.f5218;
                String str = c1542.f5219;
                boolean z = C1443.f4940;
                String str2 = (String) c1443.m3068(obj2, str);
                if (str2.equals(new C4441(new long[]{-8704373378193878448L, -5147782644575550768L}).toString())) {
                    if (((C5259) C5063.f16800.f6933) == null) {
                        C3267.m6029(new C0178(10));
                    }
                } else if (str2.equals(new C4441(new long[]{3097618421705690245L, -1972456442715048371L}).toString())) {
                    C2337 c2337 = AbstractC5781.f19048;
                    ArrayList arrayList = AbstractC3310.f11082;
                    synchronized (arrayList) {
                        AbstractC3310.f11081.add(new C3741(c2337));
                        break;
                    }
                    C0300 c0300 = AbstractC5781.f19047;
                    synchronized (arrayList) {
                        AbstractC3310.f11083.add(new C3741(c0300));
                        break;
                    }
                    AbstractC5781.m9598();
                }
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                EnumC2282 enumC2283 = EnumC2282.f7590;
                int i3 = this.f15072;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    C4036 c4037 = C5805.f19128;
                    long jM7167 = AbstractC4009.m7166(400, EnumC3021.MILLISECONDS);
                    this.f15072 = 1;
                    if (AbstractC2765.m5133(jM7167, this) == enumC2283) {
                        return enumC2283;
                    }
                } else {
                    if (i3 != 1) {
                        C0178.m389(new C4441(new long[]{5418995029672109900L, -4095842454449208066L, 8521444577524609085L, -1237605955149688137L, 2361488771330869714L, -5575033567409517209L, 1535008297790928830L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                SideActivity sideActivity = SideActivity.f416;
                AbstractC4489.m7812().finishAffinity();
                SideActivity sideActivityM7812 = AbstractC4489.m7812();
                Class<MainActivity> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(MainActivity.class));
                AbstractC4489.m7812().startActivity(Intent.makeRestartActivityTask(new Intent(sideActivityM7812, clsM9037 != null ? clsM9037 : MainActivity.class).getComponent()));
                return C2358.f7817;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                EnumC2282 enumC2284 = EnumC2282.f7590;
                int i4 = this.f15072;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    C4036 c4038 = C5805.f19128;
                    long jM7168 = AbstractC4009.m7166(1500, EnumC3021.MILLISECONDS);
                    this.f15072 = 1;
                    if (AbstractC2765.m5133(jM7168, this) == enumC2284) {
                        return enumC2284;
                    }
                } else {
                    if (i4 != 1) {
                        C0178.m389(new C4441(new long[]{-6684368292571892407L, -6203033222417134810L, -2954911419006968056L, -6890038183066740361L, 570924917191208664L, 2381380042366617626L, 5948264350978186744L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                SideActivity sideActivity2 = SideActivity.f416;
                SideActivity sideActivityM7813 = AbstractC4489.m7812();
                Class<MainActivity> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(MainActivity.class));
                AbstractC4489.m7812().startActivity(Intent.makeRestartActivityTask(new Intent(sideActivityM7813, clsM9038 != null ? clsM9038 : MainActivity.class).getComponent()));
                return C2358.f7817;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                EnumC2282 enumC2285 = EnumC2282.f7590;
                int i5 = this.f15072;
                if (i5 == 0) {
                    AbstractC0186.m409(obj);
                    App app2 = App.f407;
                    AbstractC2776.m5217().f410.m3071(new C4215(17));
                    C4036 c4039 = C5805.f19128;
                    long jM7169 = AbstractC4009.m7166(1500, EnumC3021.MILLISECONDS);
                    this.f15072 = 1;
                    if (AbstractC2765.m5133(jM7169, this) == enumC2285) {
                        return enumC2285;
                    }
                } else {
                    if (i5 != 1) {
                        C0178.m389(new C4441(new long[]{2038114614985934347L, -3657561605852961212L, -2720210448827092261L, -3385408600654418552L, -4941808807187156861L, -6426695134752763643L, 2233710422987665985L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                SideActivity sideActivity3 = SideActivity.f416;
                AbstractC4489.m7812().finishAffinity();
                return C2358.f7817;
            default:
                EnumC2282 enumC2286 = EnumC2282.f7590;
                int i6 = this.f15072;
                if (i6 == 0) {
                    AbstractC0186.m409(obj);
                    C4036 c40310 = C5805.f19128;
                    long jM71610 = AbstractC4009.m7166(1500, EnumC3021.MILLISECONDS);
                    this.f15072 = 1;
                    if (AbstractC2765.m5133(jM71610, this) == enumC2286) {
                        return enumC2286;
                    }
                } else {
                    if (i6 != 1) {
                        C0178.m389(new C4441(new long[]{-8429402205554155738L, -2619545542816807711L, -3602540128014576920L, -3385217718441833118L, 6049197150235626953L, 4919139467400942290L, -4303105925107218000L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                if (AbstractC3310.m6080()) {
                    int iM9437 = AbstractC3310.f11073;
                    if (iM9437 == -1) {
                        try {
                            iM9437 = ((C5595) AbstractC3310.m6081()).m9437();
                            AbstractC3310.f11073 = iM9437;
                        } catch (RemoteException e) {
                            C5028.m8450(e);
                            return null;
                        } catch (SecurityException unused) {
                            iM9437 = -1;
                        }
                    }
                    if (iM9437 == 2000) {
                        App app3 = App.f407;
                        AbstractC2776.m5217().f410.m3071(new C4215(20));
                        AbstractC5781.m9596();
                        MainActivity mainActivity2 = MainActivity.f411;
                        C3998.m7138(AbstractC5537.m9252(), R.string.dialog_shizuku_adb_message, null, 4);
                    }
                    break;
                }
                return C2358.f7817;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f15071;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C4564) mo217((InterfaceC0443) obj2, Integer.valueOf(((Number) obj).intValue()))).mo218(c2358);
            case 1:
                return ((C4564) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C4564) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C4564) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C4564) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C4564) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }
}
