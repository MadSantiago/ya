package p000;

import android.os.Build;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: renamed from: ۦۥۨٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5730 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ C0385 f18886;

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ long f18887;

    /* JADX INFO: renamed from: ۥَ */
    public C1387 f18888;

    /* JADX INFO: renamed from: ۥٖ */
    public C0385 f18889;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ CharSequence f18890;

    /* JADX INFO: renamed from: ۥۖ */
    public int f18891;

    /* JADX INFO: renamed from: ۦٕ */
    public /* synthetic */ Object f18892;

    /* JADX INFO: renamed from: ۦٗ */
    public CharSequence f18893;

    /* JADX INFO: renamed from: ۦۛ */
    public long f18894;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5730(long j, InterfaceC0443 interfaceC0443, C0385 c0385, CharSequence charSequence) {
        super(2, interfaceC0443);
        this.f18890 = charSequence;
        this.f18887 = j;
        this.f18886 = c0385;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C5730 c5730 = new C5730(this.f18887, interfaceC0443, this.f18886, this.f18890);
        c5730.f18892 = obj;
        return c5730;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        long j;
        C0385 c0385;
        TextSelection textSelection;
        CharSequence charSequence;
        C1387 c1387;
        int i = this.f18891;
        if (i == 0) {
            AbstractC0186.m409(obj);
            TextClassifier textClassifier = (TextClassifier) this.f18892;
            long j2 = this.f18887;
            int iM6109 = C3346.m6109(j2);
            int iM6108 = C3346.m6108(j2);
            CharSequence charSequence2 = this.f18890;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iM6109, iM6108);
            C0385 c0386 = this.f18886;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(c0386.m846());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM5145 = AbstractC2765.m5145(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f18894 = jM5145;
                this.f18891 = 2;
                if (this.f18886.m847(this.f18890, jM5145, textClassifier, this) != enumC2282) {
                    j = jM5145;
                }
            } else {
                C1387 c1388 = c0386.f1435;
                this.f18892 = textSelectionSuggestSelection;
                this.f18888 = c1388;
                this.f18889 = c0386;
                this.f18893 = charSequence2;
                this.f18894 = jM5145;
                this.f18891 = 1;
                if (c1388.mo2949(this) != enumC2282) {
                    c0385 = c0386;
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    c1387 = c1388;
                    j = jM5145;
                    c0385.f1441.setValue(new C2828(charSequence, j, textSelection.getTextClassification()));
                }
            }
            return enumC2282;
        }
        if (i == 1) {
            j = this.f18894;
            charSequence = this.f18893;
            c0385 = this.f18889;
            c1387 = this.f18888;
            textSelection = (TextSelection) this.f18892;
            AbstractC0186.m409(obj);
            try {
                c0385.f1441.setValue(new C2828(charSequence, j, textSelection.getTextClassification()));
            } finally {
                c1387.mo2950(null);
            }
        } else {
            if (i != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f18894;
            AbstractC0186.m409(obj);
        }
        return new C3346(j);
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C5730) mo217((InterfaceC0443) obj2, (TextClassifier) obj)).mo218(C2358.f7817);
    }
}
