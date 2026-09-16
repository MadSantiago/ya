package p000;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥًِٜؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1085 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥُ */
    public static final Pattern[][] f3789 = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: ۥۗ */
    public final Pattern f3791;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3523 f3792 = new C3523();

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f3790 = false;

    /* JADX INFO: renamed from: ۦؑ */
    public C0322 f3793 = new C0322(1, (byte) 0);

    public C1085(Pattern pattern) {
        this.f3791 = pattern;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        return this.f3792;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        if (this.f3790) {
            return null;
        }
        if (c1753.f5832 && this.f3791 == null) {
            return null;
        }
        return C3714.m6571(c1753.f5831);
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2294(CharSequence charSequence) {
        C0322 c0322 = this.f3793;
        StringBuilder sb = (StringBuilder) c0322.f1178;
        if (c0322.f1179 != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        c0322.f1179++;
        Pattern pattern = this.f3791;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f3790 = true;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2295() {
        this.f3792.f11668 = ((StringBuilder) this.f3793.f1178).toString();
        this.f3793 = null;
    }
}
