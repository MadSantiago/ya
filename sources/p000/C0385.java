package p000;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: ۥؔؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0385 implements InterfaceC2007 {

    /* JADX INFO: renamed from: ۥؗ */
    public final EnumC1383 f1434;

    /* JADX INFO: renamed from: ۥّ */
    public TextClassifier f1436;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f1437;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3534 f1439;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5668 f1440;

    /* JADX INFO: renamed from: ۥُ */
    public final C1387 f1435 = new C1387();

    /* JADX INFO: renamed from: ۦۙ */
    public final C4852 f1441 = AbstractC2774.m5183(null);

    /* JADX INFO: renamed from: ۥۜ */
    public final Object f1438 = new Object();

    public C0385(InterfaceC3534 interfaceC3534, Context context, EnumC1383 enumC1383, C5668 c5668) {
        this.f1439 = interfaceC3534;
        this.f1437 = context;
        this.f1434 = enumC1383;
        this.f1440 = c5668;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final LocaleList m846() {
        C5668 c5668 = this.f1440;
        if (c5668 == null) {
            return new LocaleList(((C0620) AbstractC4835.f15923.m5360().f18646.get(0)).f2309);
        }
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c5668, 10));
        Iterator it = c5668.f18646.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0620) it.next()).f2309);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m847(CharSequence charSequence, long j, TextClassifier textClassifier, AbstractC0772 abstractC0772) throws Throwable {
        C5373 c5373;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        C1387 c1387;
        Object obj;
        Object obj2;
        TextClassification textClassificationClassifyText;
        C1387 c1388;
        long j3;
        CharSequence charSequence3;
        if (abstractC0772 instanceof C5373) {
            c5373 = (C5373) abstractC0772;
            int i = c5373.f17744;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5373.f17744 = i - Integer.MIN_VALUE;
            } else {
                c5373 = new C5373(this, abstractC0772);
            }
        } else {
            c5373 = new C5373(this, abstractC0772);
        }
        Object obj3 = c5373.f17746;
        int i2 = c5373.f17744;
        C4852 c4852 = this.f1441;
        C2358 c2358 = C2358.f7817;
        C1387 c1389 = this.f1435;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j2 = c5373.f17745;
                    c1387 = c5373.f17742;
                    textClassifier2 = (TextClassifier) c5373.f17740;
                    charSequence2 = c5373.f17741;
                    AbstractC0186.m409(obj3);
                } else {
                    if (i2 != 2) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = c5373.f17745;
                    C1387 c13810 = c5373.f17742;
                    textClassificationClassifyText = (TextClassification) c5373.f17740;
                    charSequence3 = c5373.f17741;
                    AbstractC0186.m409(obj3);
                    c1388 = c13810;
                }
                try {
                    c4852.setValue(new C2828(charSequence3, j3, textClassificationClassifyText));
                    return c2358;
                } finally {
                    c1388.mo2950(null);
                }
            }
            AbstractC0186.m409(obj3);
            c5373.f17741 = charSequence;
            c5373.f17740 = textClassifier;
            c5373.f17742 = c1389;
            j2 = j;
            c5373.f17745 = j2;
            c5373.f17744 = 1;
            if (c1389.mo2949(c5373) == enumC2282) {
                return enumC2282;
            }
            charSequence2 = charSequence;
            textClassifier2 = textClassifier;
            c1387 = c1389;
            C2828 c2828 = (C2828) c4852.getValue();
            if (c2828 != null) {
                try {
                    if (C3346.m6110(j2, c2828.f9444) && AbstractC3831.m6874(charSequence2, c2828.f9445)) {
                        c1387.mo2950(null);
                        return c2358;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    c1387.mo2950(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            c1387.mo2950(obj2);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, C3346.m6109(j2), C3346.m6108(j2)).setDefaultLocales(m846()).build());
            c5373.f17741 = charSequence2;
            c5373.f17740 = textClassificationClassifyText;
            c5373.f17742 = c1389;
            c5373.f17745 = j2;
            c5373.f17744 = 2;
            if (c1389.mo2949(c5373) == enumC2282) {
                return enumC2282;
            }
            c1388 = c1389;
            j3 = j2;
            charSequence3 = charSequence2;
            c4852.setValue(new C2828(charSequence3, j3, textClassificationClassifyText));
            return c2358;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }
}
