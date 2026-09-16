package p000;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥۧؕؕۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2873 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2917 f9592;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2917 f9593;

    static {
        long j = AbstractC0118.m214(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535).f9755;
        long j2 = AbstractC0118.m213(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535).f9762;
        f9593 = AbstractC0118.m214(AbstractC3951.f13215, 0L, 0L, 0L, 0L, AbstractC3951.f13210, 0L, 0L, 0L, AbstractC3951.f13211, 0L, 0L, 0L, j, 0L, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -41506, 65535);
        f9592 = AbstractC0118.m213(AbstractC3951.f13214, 0L, 0L, 0L, 0L, AbstractC3951.f13212, 0L, 0L, 0L, AbstractC3951.f13209, 0L, 0L, 0L, j2, 0L, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -41506, 65535);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final long m5440(C2917 c2917) {
        return AbstractC4225.m7451(C1327.m2826(c2917.f9752, 0.05f, 14), C1327.m2826(c2917.f9778, 0.0f, 15));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5441(AbstractActivityC1500 abstractActivityC1500, boolean z, boolean z2, C0857 c0857, C5362 c5362, int i) {
        boolean z3;
        boolean z4;
        boolean zM4122;
        boolean z5;
        boolean zBooleanValue;
        C2917 c2917M213;
        c5362.m8979(361193525);
        new C4441(new long[]{-6131363620228146210L, -3594765523913670873L, -560685239263794153L, -6189514395276052445L, 2759971441777108461L, 1505351564197496667L, -1652017232668446270L, 5982259053610774182L, 2609897760160206155L, -6260293964077615406L, -2206426874143318957L, 5910007712775891427L, -5833946272270608039L, 2205239717237731839L}).toString();
        int i2 = i | (c5362.m8977(abstractActivityC1500) ? 4 : 2) | 144;
        if (c5362.m9011(i2 & 1, (i2 & 1171) != 1170)) {
            c5362.m8971();
            new C4441(new long[]{2739823170515204345L, 4708030436162800432L, -8056289442945713356L}).toString();
            if ((i & 1) == 0 || c5362.m8969()) {
                new C4441(new long[]{5480350887993462702L, 1896936505461524887L, 2675494568520787914L, 5804299576424931093L, -5690156712363209323L}).toString();
                int i3 = AbstractC3533.f11723;
                if (i3 == 1) {
                    c5362.m8957(561859935);
                    c5362.m9009(false);
                    zM4122 = false;
                } else if (i3 != 2) {
                    c5362.m8957(-120420826);
                    new C4441(new long[]{-1421204803372198023L, 521118646668861882L, 6346320361395142569L}).toString();
                    zM4122 = AbstractC2133.m4122(c5362);
                    c5362.m9009(false);
                } else {
                    c5362.m8957(561905530);
                    c5362.m9009(false);
                    zM4122 = true;
                }
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f410;
                C1542 c1542 = AbstractC2539.f8439;
                Object obj = c1542.f5218;
                String str = c1542.f5219;
                boolean z6 = C1443.f4940;
                z5 = zM4122;
                zBooleanValue = ((Boolean) c1443.m3068(obj, str)).booleanValue();
            } else {
                c5362.m8982();
                z5 = z;
                zBooleanValue = z2;
            }
            c5362.m8964();
            boolean z7 = zBooleanValue && Build.VERSION.SDK_INT >= 31;
            if (z7 && z5) {
                c5362.m8957(1423601897);
                new C4441(new long[]{2890308829755443517L, -5351871227647253111L, -1559055100438999190L}).toString();
                C4216 c4216 = AbstractC4354.f14355;
                new C4441(new long[]{-5957972313027299466L, 4979943347965937084L, 4372348177176106059L, -434929453687839559L, -6059628518240240820L, 4794434911658011547L, -6489180365237310346L}).toString();
                Context context = (Context) c5362.m8997(c4216);
                if (Build.VERSION.SDK_INT >= 34) {
                    c2917M213 = AbstractC0118.m214(AbstractC4593.m7994(context, R.color.system_primary_dark), AbstractC4593.m7994(context, R.color.system_on_primary_dark), AbstractC4593.m7994(context, R.color.system_primary_container_dark), AbstractC4593.m7994(context, R.color.system_on_primary_container_dark), AbstractC4593.m7994(context, R.color.system_primary_light), AbstractC4593.m7994(context, R.color.system_secondary_dark), AbstractC4593.m7994(context, R.color.system_on_secondary_dark), AbstractC4593.m7994(context, R.color.system_secondary_container_dark), AbstractC4593.m7994(context, R.color.system_on_secondary_container_dark), AbstractC4593.m7994(context, R.color.system_tertiary_dark), AbstractC4593.m7994(context, R.color.system_on_tertiary_dark), AbstractC4593.m7994(context, R.color.system_tertiary_container_dark), AbstractC4593.m7994(context, R.color.system_on_tertiary_container_dark), AbstractC4593.m7994(context, R.color.system_background_dark), AbstractC4593.m7994(context, R.color.system_on_background_dark), AbstractC4593.m7994(context, R.color.system_surface_dark), AbstractC4593.m7994(context, R.color.system_on_surface_dark), AbstractC4593.m7994(context, R.color.system_surface_variant_dark), AbstractC4593.m7994(context, R.color.system_on_surface_variant_dark), AbstractC4593.m7994(context, R.color.system_primary_dark), AbstractC4593.m7994(context, R.color.system_surface_light), AbstractC4593.m7994(context, R.color.system_on_surface_light), AbstractC4593.m7994(context, R.color.system_outline_dark), AbstractC4593.m7994(context, R.color.system_outline_variant_dark), 0L, AbstractC4593.m7994(context, R.color.system_surface_bright_dark), AbstractC4593.m7994(context, R.color.system_surface_container_dark), AbstractC4593.m7994(context, R.color.system_surface_container_high_dark), AbstractC4593.m7994(context, R.color.system_surface_container_highest_dark), AbstractC4593.m7994(context, R.color.system_surface_container_low_dark), AbstractC4593.m7994(context, R.color.system_surface_container_lowest_dark), AbstractC4593.m7994(context, R.color.system_surface_dim_dark), AbstractC4593.m7994(context, R.color.system_primary_fixed), AbstractC4593.m7994(context, R.color.system_primary_fixed_dim), AbstractC4593.m7994(context, R.color.system_on_primary_fixed), AbstractC4593.m7994(context, R.color.system_on_primary_fixed_variant), AbstractC4593.m7994(context, R.color.system_secondary_fixed), AbstractC4593.m7994(context, R.color.system_secondary_fixed_dim), AbstractC4593.m7994(context, R.color.system_on_secondary_fixed), AbstractC4593.m7994(context, R.color.system_on_secondary_fixed_variant), AbstractC4593.m7994(context, R.color.system_tertiary_fixed), AbstractC4593.m7994(context, R.color.system_tertiary_fixed_dim), AbstractC4593.m7994(context, R.color.system_on_tertiary_fixed), AbstractC4593.m7994(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    C0433 c0433M3055 = AbstractC1434.m3055(context);
                    long j = c0433M3055.f1579;
                    long j2 = c0433M3055.f1550;
                    long j3 = c0433M3055.f1552;
                    long j4 = c0433M3055.f1564;
                    long j5 = c0433M3055.f1563;
                    long j6 = c0433M3055.f1560;
                    long j7 = c0433M3055.f1572;
                    long j8 = c0433M3055.f1574;
                    long j9 = c0433M3055.f1582;
                    long j10 = c0433M3055.f1580;
                    long j11 = c0433M3055.f1590;
                    long j12 = c0433M3055.f1588;
                    long j13 = c0433M3055.f1577;
                    long j14 = c0433M3055.f1555;
                    long j15 = c0433M3055.f1585;
                    long j16 = c0433M3055.f1575;
                    c2917M213 = AbstractC0118.m214(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, c0433M3055.f1583, j, j15, c0433M3055.f1591, c0433M3055.f1578, j16, c0433M3055.f1581, c0433M3055.f1576, c0433M3055.f1558, c0433M3055.f1589, c0433M3055.f1586, c0433M3055.f1559, c0433M3055.f1561, j14, j4, j, c0433M3055.f1570, j3, j9, j6, c0433M3055.f1569, j8, j13, j10, c0433M3055.f1562, j12, 62914560, 0);
                }
                c5362.m9009(false);
            } else if (z7 && !z5) {
                c5362.m8957(1423711048);
                new C4441(new long[]{4127265326368286181L, 4913794697627747411L, 9053676072411629576L}).toString();
                C4216 c4217 = AbstractC4354.f14355;
                new C4441(new long[]{-7001778617685560004L, 3084255647562656973L, 2976468038745953625L, 4121344566317398280L, -2231184319277690206L, 2685162744942077210L, -1317630313247860799L}).toString();
                Context context2 = (Context) c5362.m8997(c4217);
                if (Build.VERSION.SDK_INT >= 34) {
                    c2917M213 = AbstractC0118.m213(AbstractC4593.m7994(context2, R.color.system_primary_light), AbstractC4593.m7994(context2, R.color.system_on_primary_light), AbstractC4593.m7994(context2, R.color.system_primary_container_light), AbstractC4593.m7994(context2, R.color.system_on_primary_container_light), AbstractC4593.m7994(context2, R.color.system_primary_dark), AbstractC4593.m7994(context2, R.color.system_secondary_light), AbstractC4593.m7994(context2, R.color.system_on_secondary_light), AbstractC4593.m7994(context2, R.color.system_secondary_container_light), AbstractC4593.m7994(context2, R.color.system_on_secondary_container_light), AbstractC4593.m7994(context2, R.color.system_tertiary_light), AbstractC4593.m7994(context2, R.color.system_on_tertiary_light), AbstractC4593.m7994(context2, R.color.system_tertiary_container_light), AbstractC4593.m7994(context2, R.color.system_on_tertiary_container_light), AbstractC4593.m7994(context2, R.color.system_background_light), AbstractC4593.m7994(context2, R.color.system_on_background_light), AbstractC4593.m7994(context2, R.color.system_surface_light), AbstractC4593.m7994(context2, R.color.system_on_surface_light), AbstractC4593.m7994(context2, R.color.system_surface_variant_light), AbstractC4593.m7994(context2, R.color.system_on_surface_variant_light), AbstractC4593.m7994(context2, R.color.system_primary_light), AbstractC4593.m7994(context2, R.color.system_surface_dark), AbstractC4593.m7994(context2, R.color.system_on_surface_dark), AbstractC4593.m7994(context2, R.color.system_outline_light), AbstractC4593.m7994(context2, R.color.system_outline_variant_light), 0L, AbstractC4593.m7994(context2, R.color.system_surface_bright_light), AbstractC4593.m7994(context2, R.color.system_surface_container_light), AbstractC4593.m7994(context2, R.color.system_surface_container_high_light), AbstractC4593.m7994(context2, R.color.system_surface_container_highest_light), AbstractC4593.m7994(context2, R.color.system_surface_container_low_light), AbstractC4593.m7994(context2, R.color.system_surface_container_lowest_light), AbstractC4593.m7994(context2, R.color.system_surface_dim_light), AbstractC4593.m7994(context2, R.color.system_primary_fixed), AbstractC4593.m7994(context2, R.color.system_primary_fixed_dim), AbstractC4593.m7994(context2, R.color.system_on_primary_fixed), AbstractC4593.m7994(context2, R.color.system_on_primary_fixed_variant), AbstractC4593.m7994(context2, R.color.system_secondary_fixed), AbstractC4593.m7994(context2, R.color.system_secondary_fixed_dim), AbstractC4593.m7994(context2, R.color.system_on_secondary_fixed), AbstractC4593.m7994(context2, R.color.system_on_secondary_fixed_variant), AbstractC4593.m7994(context2, R.color.system_tertiary_fixed), AbstractC4593.m7994(context2, R.color.system_tertiary_fixed_dim), AbstractC4593.m7994(context2, R.color.system_on_tertiary_fixed), AbstractC4593.m7994(context2, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    C0433 c0433M3056 = AbstractC1434.m3055(context2);
                    long j17 = c0433M3056.f1563;
                    long j18 = c0433M3056.f1587;
                    long j19 = c0433M3056.f1564;
                    long j20 = c0433M3056.f1570;
                    long j21 = c0433M3056.f1579;
                    long j22 = c0433M3056.f1566;
                    long j23 = c0433M3056.f1554;
                    long j24 = c0433M3056.f1582;
                    long j25 = c0433M3056.f1569;
                    long j26 = c0433M3056.f1551;
                    long j27 = c0433M3056.f1573;
                    long j28 = c0433M3056.f1577;
                    long j29 = c0433M3056.f1562;
                    long j30 = c0433M3056.f1565;
                    long j31 = c0433M3056.f1559;
                    long j32 = c0433M3056.f1585;
                    c2917M213 = AbstractC0118.m213(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j30, j31, j32, c0433M3056.f1575, j17, c0433M3056.f1591, c0433M3056.f1571, c0433M3056.f1584, c0433M3056.f1583, c0433M3056.f1581, j30, c0433M3056.f1556, c0433M3056.f1557, j32, c0433M3056.f1553, c0433M3056.f1568, c0433M3056.f1567, j19, j21, j20, c0433M3056.f1552, j24, c0433M3056.f1560, j25, c0433M3056.f1574, j28, c0433M3056.f1580, j29, c0433M3056.f1588, 62914560, 0);
                }
                c5362.m9009(false);
            } else if (z5) {
                c5362.m8957(-785354876);
                c5362.m9009(false);
                c2917M213 = f9593;
            } else {
                c5362.m8957(-785354107);
                c5362.m9009(false);
                c2917M213 = f9592;
            }
            AbstractC5420.m9092(c2917M213, null, null, c0857, c5362, 3072);
            int iM7470 = AbstractC4225.m7470(c2917M213.f9775);
            int iM7471 = AbstractC4225.m7470(m5440(c2917M213));
            C3566 c3566 = new C3566(iM7470, iM7471, 0, new C4215(27));
            C3566 c3567 = z5 ? new C3566(iM7471, iM7471, 2, new C4215(26)) : new C3566(iM7471, iM7471, 1, new C4215(25));
            C2559 c2559 = AbstractC0471.f1718;
            View decorView = abstractActivityC1500.getWindow().getDecorView();
            C2559 c3842 = AbstractC0471.f1718;
            if (c3842 == null) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    c3842 = new C3249();
                } else if (i4 >= 30) {
                    c3842 = new C2592();
                } else if (i4 >= 29) {
                    c3842 = new C0157();
                } else {
                    c3842 = i4 >= 28 ? new C3842() : new C2559();
                }
                AbstractC0471.f1718 = c3842;
            }
            C2559 c25510 = c3842;
            RunnableC4991 runnableC4991 = new RunnableC4991(c25510, c3566, c3567, abstractActivityC1500, decorView, 1);
            ViewGroup viewGroup = (ViewGroup) decorView;
            int i5 = 0;
            while (true) {
                if (i5 >= viewGroup.getChildCount()) {
                    C3319 c3319 = new C3319(runnableC4991, viewGroup.getContext());
                    c3319.setTag(c25510);
                    c3319.setVisibility(8);
                    c3319.setWillNotDraw(true);
                    viewGroup.addView(c3319);
                    break;
                }
                int i6 = i5 + 1;
                View childAt = viewGroup.getChildAt(i5);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (childAt.getTag() instanceof C2559) {
                    break;
                } else {
                    i5 = i6;
                }
            }
            runnableC4991.run();
            c25510.mo4837(abstractActivityC1500.getWindow());
            z3 = z5;
            z4 = zBooleanValue;
        } else {
            c5362.m8982();
            z3 = z;
            z4 = z2;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5132(abstractActivityC1500, z3, z4, c0857, i);
        }
    }
}
